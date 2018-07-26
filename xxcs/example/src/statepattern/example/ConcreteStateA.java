package statepattern.example;

public class ConcreteStateA implements State {

    @Override
    public void handle(String sampleParameter){
        System.out.println("ConcreteStateA handle : " + sampleParameter);
    }
}
