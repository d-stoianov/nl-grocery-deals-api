package dstoianov.nlgrocerydealsapi.controller;

import dstoianov.nlgrocerydealsapi.model.GroceryDealCategory;
import dstoianov.nlgrocerydealsapi.model.GroceryOffer;
import dstoianov.nlgrocerydealsapi.model.StoreName;
import dstoianov.nlgrocerydealsapi.service.GroceryDealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroceryDealController {
    GroceryDealService groceryDealService;

    @Autowired
    public GroceryDealController(GroceryDealService groceryDealService) {
        this.groceryDealService = groceryDealService;
    }

    @GetMapping("/deals")
    public List<GroceryDealCategory> getGroceryDeal() {
        return groceryDealService.getDeals();
    }

    @PostMapping("/deal")
    public ResponseEntity<String> createGroceryDeal(
            @RequestParam(required = true) String store,
            @RequestBody List<GroceryDealCategory> categories
    ) {
        // validate store name
        if (StoreName.fromString(store) == null) {
            return ResponseEntity.badRequest().body("Invalid Store Name");
        }

        // validate categories
        if (categories == null || categories.isEmpty()) {
            return ResponseEntity.badRequest().body("Categories cannot be empty or null");
        }

        for (GroceryDealCategory category : categories) {
            String categoryName = category.getCategoryName();

            // validate category name
            if (categoryName == null || categoryName.trim().isEmpty()) {
                return ResponseEntity.badRequest().body("Category name cannot be empty or null");
            }

            // validate offers
            List<GroceryOffer> offers = category.getOffers();

            if (offers == null || offers.isEmpty()) {
                return ResponseEntity.badRequest().body("Offers cannot be empty or null in category " + categoryName);
            }

            int offerIndex = 0;
            for (GroceryOffer offer : offers) {
                // validate product name
                if (offer.getProductName() == null || offer.getProductName().isEmpty()) {
                    return ResponseEntity.badRequest().body(
                            "Product name cannot be empty or null in category " + categoryName + " with " + offerIndex + " offer index"
                    );
                }

                // validate image
                if (offer.getImage() == null || offer.getImage().isEmpty()) {
                    return ResponseEntity.badRequest().body(
                            "Image cannot be empty or null in category " + categoryName + " with " + offerIndex + " offer index"
                    );
                }

                // validate price
                if (offer.getPrice() == null) {
                    return ResponseEntity.badRequest().body(
                            "Price is null in category " + categoryName + " with " + offerIndex + " offer index"
                    );
                }

                // validate date
                if (offer.getDate() == null) {
                    return ResponseEntity.badRequest().body(
                            "Price is null in category " + categoryName + " with " + offerIndex + " offer index"
                    );
                }

                if (offer.getDate().getFrom() == null || offer.getDate().getTo() == null) {
                    return ResponseEntity.badRequest().body("From or to date is null in category " + categoryName + " with " + offerIndex + " offer index");
                }

                offerIndex++;
            }

        }

        return ResponseEntity.ok().body("Deal created successfully");
    }
}
