package designpattern.dip.step2.repo;

import designpattern.dip.step2.model.PurchaseOrder;
import designpattern.dip.step2.service.PORepo;

public class NoSqlRepo implements PORepo {

    public PurchaseOrder loadById(String id){

        return null;
    }

    public void save(PurchaseOrder purchaseOrder){
        System.out.println("Save PO in mongo DB");
    }
}
