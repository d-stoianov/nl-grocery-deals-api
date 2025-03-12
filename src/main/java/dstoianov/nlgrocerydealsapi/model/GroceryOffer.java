package dstoianov.nlgrocerydealsapi.model;

public class GroceryOffer {
    private String productName;
    private String image;
    private GroceryOfferPrice price;
    private GroceryOfferDate date;

    public GroceryOffer(String productName, String image, GroceryOfferPrice price, GroceryOfferDate date) {
        this.productName = productName;
        this.image = image;
        this.price = price;
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public String getImage() {
        return image;
    }

    public GroceryOfferPrice getPrice() {
        return price;
    }

    public GroceryOfferDate getDate() {
        return date;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(GroceryOfferPrice price) {
        this.price = price;
    }

    public void setDate(GroceryOfferDate date) {
        this.date = date;
    }

    public void setImage(String image) {
        this.image = image;
    }
}