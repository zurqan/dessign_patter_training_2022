package designpattern.dip.step1.model;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }
}
