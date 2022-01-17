package designpattern.dip.step2.service;

import designpattern.dip.step2.model.Item;
import designpattern.dip.step2.model.PurchaseOrder;
import designpattern.dip.step2.repo.RDSRepo;

public class POService {

    private final PORepo poRepo;

    public POService(PORepo poRepo) {
        this.poRepo = poRepo;
    }

    public void addItem(String poIId, Item item){

        //load po by id
        PurchaseOrder purchaseOrder = poRepo.loadById(poIId);

        //add item to po

        purchaseOrder.addItem(item);

        //save po

        poRepo.save(purchaseOrder);
    }
}
