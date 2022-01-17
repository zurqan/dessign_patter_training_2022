package designpattern.dip.step1.repo;

import designpattern.dip.step1.model.PurchaseOrder;

public class RDSRepo {

    public PurchaseOrder loadById( String id){

        return null;
    }

    public void savePo(PurchaseOrder purchaseOrder){
        System.out.println("Save PO");
    }
}
