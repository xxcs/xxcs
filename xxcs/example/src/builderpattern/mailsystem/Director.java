package builderpattern.mailsystem;

public class Director {
    Builder builder;
    /**
     * 构造子
     */
    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     *
     */
    public void construct(String toAddress, String fromAddress){
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildSendData();
        this.builder.sendMessage();
    }
}
