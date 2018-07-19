package bridgepattern.sendmessage;

public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor impl){
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser){
        //对于普通方法，直接调用父类方法，发送消息即可
        super.sendMessage(message, toUser);
    }
}
