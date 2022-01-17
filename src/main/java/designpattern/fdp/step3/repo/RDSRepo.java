package designpattern.fdp.step3.repo;

import designpattern.fdp.step3.model.PurchaseOrder;
import designpattern.fdp.step3.service.PORepo;

public class RDSRepo implements PORepo {


    public PurchaseOrder loadById(String id){

        return null;
    }

    public void save(PurchaseOrder purchaseOrder){
        System.out.println("Save PO");
    }
}
