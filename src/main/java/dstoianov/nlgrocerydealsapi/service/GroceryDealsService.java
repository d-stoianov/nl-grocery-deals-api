package dstoianov.nlgrocerydealsapi.service;

import dstoianov.nlgrocerydealsapi.model.*;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class GroceryDealsService {
    // get all deals
    public List<GroceryDeal> getDeals() {
        var sampleGroceryOffer = new GroceryOffer(
                "olliebolen",
                "lol.jpg",
                new GroceryOfferPrice(12.0, 11.5),
                new GroceryOfferDate(
                        OffsetDateTime.parse("2025-03-12T23:00:00.000Z"),
                        OffsetDateTime.parse("2025-03-14T23:00:00.000Z")
                ));

        // mock data
        List<GroceryDealCategory> jumboCategories = List.of(new GroceryDealCategory(
                "my_category", List.of(sampleGroceryOffer, sampleGroceryOffer)
        ));
        var jumboDeals = new GroceryDeal(StoreName.JUMBO, jumboCategories);
        List<GroceryDealCategory> ahCategories = List.of(new GroceryDealCategory(
                "my_category2", List.of(sampleGroceryOffer, sampleGroceryOffer)
        ));
        var ahDeals = new GroceryDeal(StoreName.AH, ahCategories);

        return List.of(jumboDeals, ahDeals);
    }

    // get store specific deals
    public List<GroceryDealCategory> getDeals(StoreName storeName) {
        var sampleGroceryOffer = new GroceryOffer(
                "olliebolen",
                "lol.jpg",
                new GroceryOfferPrice(12.0, 11.5),
                new GroceryOfferDate(
                        OffsetDateTime.parse("2025-03-12T23:00:00.000Z"),
                        OffsetDateTime.parse("2025-03-14T23:00:00.000Z")
                ));

        return List.of(new GroceryDealCategory(
                "my_category", List.of(sampleGroceryOffer, sampleGroceryOffer)
        ));
    }
}
