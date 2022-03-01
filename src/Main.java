import model.Invoice;
import model.Item;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Item tas = new Item("tas", 200, 10);
        Item jam = new Item("jam", 200, 10);
        Item earphone = new Item("earphone", 200, 10);

        // No 1
        List<Item> list = new ArrayList<>();
        list.add(tas);
        list.add(jam);
        list.add(earphone);
        list.forEach(e -> System.out.println(e.getName() + " " + e.getStock() + " " + e.getPoint()));

        // no 2
        List<Invoice> invoices = new ArrayList();
        HashMap<Item, Integer> soldItem = new HashMap<>();
        buyItem(new Date(),tas,  5, soldItem, invoices);
        buyItem(new Date(),tas,  5, soldItem, invoices);
        buyItem(new Date(), tas, 5, soldItem, invoices);
        System.out.println(tas.getStock());
        soldItem.forEach((k,v) -> System.out.println(k.getName() + " " + v.toString()));


        // no 4
        tas.setStock(20);
        jam.setPoint(2000);

    }
    // no 3
    public static void buyItem(Date date,Item item,  int qty, HashMap<Item, Integer> map, List<Invoice> invoices){
        //check the item's stock
        if(item.getStock() >= qty){
            System.out.println("berhasil");
            item.setStock(item.getStock() - qty);
            if(map.get(item) == null){
                map.put(item, qty);
            }else{
                map.put(item, map.get(item) + qty);
            }
            invoices.add(new Invoice(item, date));
        }
    }
}
