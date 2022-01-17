package designpattern.dip.step1.service;

import designpattern.dip.step1.model.Item;
import designpattern.dip.step1.model.PurchaseOrder;
import designpattern.dip.step1.repo.RDSRepo;

public class POService {

    private final RDSRepo rdsRepo;

    public POService(RDSRepo rdsRepo) {
        this.rdsRepo = rdsRepo;
    }

    public void addItem(String poIId, Item item){

        //load po by id
        PurchaseOrder purchaseOrder = rdsRepo.loadById(poIId);

        //add item to po

        purchaseOrder.addItem(item);

        //save po

        rdsRepo.savePo(purchaseOrder);
    }
}
