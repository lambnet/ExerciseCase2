package model;

import java.util.Date;
import java.util.HashMap;


public class Item {
    private String name;
    private int point;
    private int stock;

    public Item(String name, int point, int stock) {
        this.name = name;
        this.point = point;
        this.stock = stock;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }



}
