package singlepattern.example;

public class SingleObjectStaticInterior implements SingleObject {
    /**
     * 登记式/静态内部类
     */
    private static class SingleObjectHolder{
        private static final SingleObject INSTANCE = new SingleObjectStaticInterior();
    }

    private SingleObjectStaticInterior(){};

    //public static final SingleObject getInstance()
    public static SingleObject getInstance(){
        return SingleObjectHolder.INSTANCE;
    }

    @Override
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
