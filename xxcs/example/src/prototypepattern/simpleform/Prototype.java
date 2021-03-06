package prototypepattern.simpleform;

public interface Prototype {
    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出的对象
     */
    public Prototype clone();
}
