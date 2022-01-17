package designpattern.fdp.step3.model;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }
}
