package designpattern.fdp.step3.service;

import designpattern.fdp.step3.model.Item;
import designpattern.fdp.step3.model.PurchaseOrder;

public  class POServiceVersion2 {

    private final PORepoFactory poRepoFactory;

    public POServiceVersion2(PORepoFactory poRepoFactory) {
        this.poRepoFactory = poRepoFactory;
    }

    public void addItem(String poIId, Item item){

        //load po by id
        PurchaseOrder purchaseOrder = poReop().loadById(poIId);

        //add item to po

        purchaseOrder.addItem(item);

        //save po

        poReop().save(purchaseOrder);
    }

    public PORepo poReop(){
        return poRepoFactory.makePoRepo();
    };
}
