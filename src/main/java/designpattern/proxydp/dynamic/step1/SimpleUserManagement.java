package designpattern.proxydp.dynamic.step1;

public class SimpleUserManagement implements UserManagement {

    @Override
    public void registerUser(String userName){
        System.out.println("Register User "+userName);
    }

    @Override
    public void unRegisterUser(String userName){
        System.out.println("Unregister User "+userName);
    }
}
