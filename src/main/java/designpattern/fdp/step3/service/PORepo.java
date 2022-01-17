package designpattern.fdp.step3.service;

import designpattern.fdp.step3.model.PurchaseOrder;

public interface PORepo {

    PurchaseOrder loadById(String poId);

    void save(PurchaseOrder purchaseOrder);
}
