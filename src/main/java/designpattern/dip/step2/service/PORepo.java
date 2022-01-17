package designpattern.dip.step2.service;

import designpattern.dip.step2.model.PurchaseOrder;

public interface PORepo {

    PurchaseOrder loadById(String poId);

    void save(PurchaseOrder purchaseOrder);
}
