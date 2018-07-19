package adapterpattern.objectdapter;

public class Adapter implements Target {
    private Adaptee adaptee;

    public  Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    /**
     * 源类Adaptee有方法sampleOperation1
     * 因此适配器类直接委派即可
     */
    @Override
    public void sampleOperation1(){
        System.out.println("Adapter通过Adaptee的对象调用实现接口方法sampleOperation1");
        this.adaptee.sampleOperation1();
    }

    /**
     * 源类Adaptee没有方法sampleOperation2
     * 因此由适配器类补充此方法
     */
    @Override
    public void sampleOperation2(){
        System.out.println("Adapter实现Target接口方法sampleOperation2");
    }
}
