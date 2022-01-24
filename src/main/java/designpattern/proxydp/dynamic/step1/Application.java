package designpattern.proxydp.dynamic.step1;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Application {

    public static void main(String[] args) {

        UserManagement userManagement = (UserManagement)Proxy.newProxyInstance(Application.class.getClassLoader(),
                new Class[]{UserManagement.class}, new UserManagInvocationHandler(new SimpleUserManagement()));

        userManagement.registerUser("Mohammad");
        userManagement.registerUser("Ahmad");
        userManagement.registerUser("Ali");
        userManagement.unRegisterUser("Ali");
    }

    static class UserManagInvocationHandler implements InvocationHandler{

        private final UserManagement target;

        UserManagInvocationHandler(UserManagement target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            System.out.println("Interrupt Method calling "+method.getName());
            //check security
            //should not call unRegisterUser
            if(method.getName().equals("unRegisterUser")){
                throw new RuntimeException("Un Authorized");
            }
            return method.invoke(target,args);

        }
    }
}
