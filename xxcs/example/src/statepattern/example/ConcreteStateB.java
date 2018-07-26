package statepattern.example;

public class ConcreteStateB implements State{
    @Override
    public void handle(String sampleParameter){
        System.out.println("ConcreteStateB handle : " + sampleParameter);
    }

}
