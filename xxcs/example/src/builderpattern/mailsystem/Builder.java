package builderpattern.mailsystem;

import javax.xml.crypto.Data;
import java.util.Date;

public abstract class Builder {
    protected AutoMessage msg;

    //标题零件的建造方法
    public abstract void buildSubject();
    //内容零件的建造方法
    public abstract void buildBody();
    //收件人零件的建造方法
    public void buildTo(String to){
        msg.setTo(to);
    }
    //发件人零件的建造方法
    public void buildFrom(String from){
        msg.setFrom(from);
    }

    public void buildSendData(){
        msg.setSendDate(new Date());
    }
    /**
     * 邮件产品完成后，用此方法发送邮件
     * 此方法相当于产品返还方法
     */
    public void sendMessage(){
        msg.send();
    }
}
