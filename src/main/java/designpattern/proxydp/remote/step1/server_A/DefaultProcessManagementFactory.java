package designpattern.proxydp.remote.step1.server_A;

import designpattern.proxydp.remote.ProcessManagement;
import designpattern.proxydp.remote.ProcessManagementFactory;

public class DefaultProcessManagementFactory implements ProcessManagementFactory {
    @Override
    public ProcessManagement instance() {
        return new SimpleProcessManagement();
    }
}
