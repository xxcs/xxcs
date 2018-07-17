package proxypattern.example;

public class RealObject extends AbstractObject {
    @Override
    public void operation(){
        //一些操作
        System.out.println("代理模式下原对象的操作");
    }
}
