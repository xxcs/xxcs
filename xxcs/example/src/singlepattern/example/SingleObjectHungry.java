package singlepattern.example;

public class SingleObjectHungry implements SingleObject {
    /**
     * 饿汉式
     */
    private static SingleObject instance = new SingleObjectHungry();
    private SingleObjectHungry(){};

    @Override
    public SingleObject getInstance(){
        return instance;
    }

    @Override
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
