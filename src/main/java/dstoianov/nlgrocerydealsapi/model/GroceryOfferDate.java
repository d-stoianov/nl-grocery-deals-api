package dstoianov.nlgrocerydealsapi.model;

import java.time.OffsetDateTime;

public class GroceryOfferDate {
    private OffsetDateTime from;
    private OffsetDateTime to;

    public GroceryOfferDate() {
        // required for Jackson deserialization
    }

    public GroceryOfferDate(OffsetDateTime from, OffsetDateTime to) {
        this.from = from;
        this.to = to;
    }

    public OffsetDateTime getFrom() {
        return from;
    }

    public OffsetDateTime getTo() {
        return to;
    }

    public void setFrom(OffsetDateTime from) {
        this.from = from;
    }

    public void setTo(OffsetDateTime to) {
        this.to = to;
    }
}