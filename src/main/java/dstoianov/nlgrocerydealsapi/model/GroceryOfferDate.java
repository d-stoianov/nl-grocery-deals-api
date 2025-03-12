package dstoianov.nlgrocerydealsapi.model;

import java.time.LocalDate;

public class GroceryOfferDate {
    private LocalDate from;
    private LocalDate to;


    public GroceryOfferDate(LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }
}
