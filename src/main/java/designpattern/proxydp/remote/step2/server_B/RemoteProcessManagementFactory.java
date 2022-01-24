package designpattern.proxydp.remote.step2.server_B;

import designpattern.proxydp.remote.ProcessManagement;
import designpattern.proxydp.remote.ProcessManagementFactory;
import designpattern.proxydp.remote.step1.server_A.SimpleProcessManagement;

import java.io.IOException;

public class RemoteProcessManagementFactory implements ProcessManagementFactory {
    @Override
    public ProcessManagement instance() {
        try {
            return new ProxyProcessManagement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
