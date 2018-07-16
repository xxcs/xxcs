package builderpattern.mailsystem;

public class WelcomeBuilder extends Builder{
    public WelcomeBuilder(){
        msg = new WelcomeMessage();
    }

    @Override
    public void buildBody(){
        //TODO Auto-generated method stub
        msg.setBody("欢迎内容");
    }

    @Override
    public void buildSubject(){
        msg.setSubject("欢迎标题");
    }
}
