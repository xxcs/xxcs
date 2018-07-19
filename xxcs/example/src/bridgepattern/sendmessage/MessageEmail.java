package bridgepattern.sendmessage;

public class MessageEmail implements MessageImplementor {
    @Override
    public void send(String message, String toUser){

        System.out.println("使用邮件的方法，发送消息'" + message + "'给" + toUser);
    }
}
