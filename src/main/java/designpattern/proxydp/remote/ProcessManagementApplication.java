package designpattern.proxydp.remote;

public class ProcessManagementApplication {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ProcessManagementFactory processManagementFactory=(ProcessManagementFactory)Class.forName(args[0]).newInstance();
        System.out.println(processManagementFactory.getClass());
        ProcessManagement processManagement = processManagementFactory.instance();

        processManagement.startProcess("ABC");
        processManagement.stopProcess("ABC");
    }
}
