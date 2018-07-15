package singlepattern.example;

public class SingleObjectDoubleCheckedLocking implements SingleObject {
    /**
     * 双检锁/双重校验锁（DCL, double-checked locking）
     */
    private volatile static SingleObject instance;
    private SingleObjectDoubleCheckedLocking(){};

    @Override
    public SingleObject getInstance(){
        synchronized (SingleObjectDoubleCheckedLocking.class){
            if (instance == null){
                instance = new SingleObjectDoubleCheckedLocking();
            }
        }
        return instance;
    }

    @Override
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
