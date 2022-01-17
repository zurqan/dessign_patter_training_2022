package designpattern.fdp.step3.service.impl2;

import designpattern.fdp.step3.repo.RDSRepo;
import designpattern.fdp.step3.service.PORepo;
import designpattern.fdp.step3.service.PORepoFactory;

public class RDSFactoryImpl implements PORepoFactory {
    @Override
    public PORepo makePoRepo() {
        return new RDSRepo();
    }
}
