package adapterpattern.classadapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2(){
        System.out.println("Adapter实现Target接口方法sampleOperation2");
    }
}
