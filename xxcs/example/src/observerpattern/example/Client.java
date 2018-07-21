package observerpattern.example;

public class Client {
    public static void main(String[] args){
        //创建主题
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者对象
        Observer observer = new ConcreteObserver();
        subject.attach(observer);

        subject.change("new state");
    }
}
