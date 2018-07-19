package prototypepattern.simpleform;

public class ConcretePrototype1 implements Prototype {
    public Prototype clone(){
        //最简单的克隆，创建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototype1();

        return prototype;
    }
}
