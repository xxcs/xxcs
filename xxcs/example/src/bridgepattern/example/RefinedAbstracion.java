package bridgepattern.example;

public class RefinedAbstracion extends Abstraction {
    /**
     *修正抽象化角色
     */

    public RefinedAbstracion(Implementor imp1){
        super(imp1);
    }

    //其他的操作方法
    public void otherOperation(){

    }
}
