package designpattern.proxydp.remote.step1.server_A;

import designpattern.proxydp.remote.ProcessManagement;

public class SimpleProcessManagement implements ProcessManagement {
    @Override
    public void startProcess(String id) {
        System.out.printf("starting Process %s \n",id);
    }

    @Override
    public void stopProcess(String id) {
        System.out.printf("stopping Process %s \n",id);

    }
}
