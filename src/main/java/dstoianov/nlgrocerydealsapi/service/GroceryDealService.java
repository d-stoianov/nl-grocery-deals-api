package dstoianov.nlgrocerydealsapi.service;

import dstoianov.nlgrocerydealsapi.model.GroceryDealCategory;
import dstoianov.nlgrocerydealsapi.model.GroceryOffer;
import dstoianov.nlgrocerydealsapi.model.GroceryOfferDate;
import dstoianov.nlgrocerydealsapi.model.GroceryOfferPrice;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class GroceryDealService {
    public List<GroceryDealCategory> getDeals() {
        var sampleGroceryOffer = new GroceryOffer(
                "olliebolen",
                "lol.jpg",
                new GroceryOfferPrice(12.0, 11.5),
                new GroceryOfferDate(
                        LocalDate.of(2022, 1, 2),
                        LocalDate.of(2022, 1, 2)
                ));

        return List.of(new GroceryDealCategory(
                "my_category", List.of(sampleGroceryOffer, sampleGroceryOffer)
        ));
    }
}
