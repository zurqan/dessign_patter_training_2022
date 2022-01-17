package designpattern.fdp.step3.service.impl;

import designpattern.fdp.step3.repo.RDSRepo;
import designpattern.fdp.step3.service.PORepo;
import designpattern.fdp.step3.service.POService;

public class RDSPOService extends POService {
    @Override
    public PORepo poReop() {
        return new RDSRepo();
    }
}
