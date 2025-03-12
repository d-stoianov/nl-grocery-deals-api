package dstoianov.nlgrocerydealsapi.model;

import java.util.List;

public class GroceryDealCategory {
    private String categoryName;
    private List<GroceryOffer> offers;

    public GroceryDealCategory(String categoryName, List<GroceryOffer> offers) {
        this.categoryName = categoryName;
        this.offers = offers;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<GroceryOffer> getOffers() {
        return offers;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setOffers(List<GroceryOffer> offers) {
        this.offers = offers;
    }
}
