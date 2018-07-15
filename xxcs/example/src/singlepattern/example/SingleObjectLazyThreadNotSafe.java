package singlepattern.example;

public class SingleObjectLazyThreadNotSafe implements SingleObject {
    /*
     * 单例模式
     * 懒汉式
     * 线程不安全
     */
    //创建SingleObject的一个对象
    private static SingleObject instance;

    //让构造函数为private,这样改例就不会被实例化
    private SingleObjectLazyThreadNotSafe(){}

    //获取唯一可用的对象
    public SingleObject getInstance(){
        if (instance == null){
            instance =  new SingleObjectLazyThreadNotSafe();
        }
        return instance;
    }

    @Override
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
