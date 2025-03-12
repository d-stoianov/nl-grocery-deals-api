package dstoianov.nlgrocerydealsapi.model;

public class GroceryOfferPrice {
    private double now;
    private double was;

    public GroceryOfferPrice(double now, double was) {
        this.now = now;
        this.was = was;
    }

    public double getNow() {
        return now;
    }

    public double getWas() {
        return was;
    }

    public void setNow(double now) {
        this.now = now;
    }

    public void setWas(double was) {
        this.was = was;
    }
}

