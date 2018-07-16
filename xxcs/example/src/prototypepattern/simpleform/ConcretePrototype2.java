package prototypepattern.simpleform;

public class ConcretePrototype2 implements Prototype {
    public Prototype clone(){
        //最简单的克隆，新建一个对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototype2();
        return prototype;
    }
}
