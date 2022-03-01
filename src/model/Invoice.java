package model;

import java.util.Date;

public class Invoice {
    private final Item item;
    private final Date date;
    private final int qty;

    public Invoice(Item item, Date date, int qty) {
        this.item = item;
        this.date = date;
        this.qty = qty;
    }

    public String getItemName() {
        return item.getName();
    }

    public Date getDate() {
        return date;
    }

    public int getQty() {
        return qty;
    }
}
