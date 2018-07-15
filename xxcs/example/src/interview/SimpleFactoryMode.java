package interview;

interface Login{
    public boolean verify(String name, String password);
}

class DomainLogin implements Login {

    @Override
    public boolean verify(String name, String password){
        // TODO Auto-generated method stub
        /**
         * 业务逻辑
         *
         */
        System.out.println("DomainLogin: 用户名:" + name + "密码:" + password + "验证无误");
        return true;
    }
}

class PasswordLogin implements Login{

    @Override
    public boolean verify(String name, String password){
        // TODO Auto-generated method stub
        /**
         * 业务逻辑
         *
         */
        System.out.println("PasswordLogin: 用户名:" + name + "密码:" + password + "验证无误");
        return true;
    }
}

class LoginManager{
    public static  Login factory(String type){
        if (type.equals("password")){
            return new PasswordLogin();
        }else if (type.equals("passcode")){
            return new DomainLogin();
        }else{
            /*
            *这里抛出一个异常
             */
            throw new RuntimeException("没有找到合适的登录类型");
        }
    }
}

public class SimpleFactoryMode {
    public static void main(String[] args){
        String LoginType = "password";
        String name = "name";
        String password = "password";
        Login login = LoginManager.factory(LoginType);
        boolean bool = login.verify(name, password);
        if (bool){
            /*
            *业务逻辑
             */
        }else {
            /*
            *业务逻辑
             */
        }
    }
}
