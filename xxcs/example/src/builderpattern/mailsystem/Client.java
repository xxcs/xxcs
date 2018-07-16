package builderpattern.mailsystem;

public class Client {
    public static void main(String[] args){
        //TODO Auto-generates method stub
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("toAddress@126.com", "fromAddress@126.com");
    }
}
