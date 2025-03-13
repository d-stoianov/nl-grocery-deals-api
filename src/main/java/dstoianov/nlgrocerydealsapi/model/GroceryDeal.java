package dstoianov.nlgrocerydealsapi.model;

import java.util.List;

public class GroceryDeal {
    private StoreName storeName;
    private List<GroceryDealCategory> categories;

    public GroceryDeal(StoreName storeName, List<GroceryDealCategory> categories) {
        this.categories = categories;
        this.storeName = storeName;
    }

    public StoreName getStoreName() {
        return storeName;
    }

    public void setStoreName(StoreName storeName) {
        this.storeName = storeName;
    }

    public List<GroceryDealCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<GroceryDealCategory> categories) {
        this.categories = categories;
    }
}
