package bridgepattern.example;

public abstract class Abstraction {
    /**
     * 抽象化角色
     */

    protected Implementor imp1;

    public Abstraction(Implementor imp1){
        this.imp1 = imp1;
    }

    //示例方法
    public void operation(){
        imp1.operationImp1();
    }
}
