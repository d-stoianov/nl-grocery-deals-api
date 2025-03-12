package dstoianov.nlgrocerydealsapi.model;

public class GroceryOfferPrice {
    private String now;
    private String was;

    public GroceryOfferPrice(String now, String was) {
        this.now = now;
        this.was = was;
    }

    public String getNow() {
        return now;
    }

    public String getWas() {
        return was;
    }

    public void setNow(String now) {
        this.now = now;
    }

    public void setWas(String was) {
        this.was = was;
    }
}

