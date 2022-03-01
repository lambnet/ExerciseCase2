package model;

import java.util.Date;

public class Invoice {
    private Item item;
    private Date date;

    public Invoice(Item item, Date date) {
        this.item = item;
        this.date = date;
    }

    public String getItemName() {
        return item.getName();
    }

    public Date getDate() {
        return date;
    }
}
