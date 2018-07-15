package singlepattern.example;

public class SingleObjectLazyThreadSafe implements SingleObject {
    /*单例模式
     *懒汉式
     *线程安全
     */
    private static SingleObjectLazyThreadSafe instance;
    private SingleObjectLazyThreadSafe(){};

    public static SingleObject getInstance(){
        SingleObject a = get();
        return a;
    }

    private static synchronized SingleObject get(){
        if (instance == null) {
            instance = new SingleObjectLazyThreadSafe();
        }
        return instance;
    }

    @Override
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
