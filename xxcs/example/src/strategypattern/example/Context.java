package strategypattern.example;

public class Context {

     // 持有一个具体策略对象
    private Strategy strategy;

    /**
     * 构造函数
     * @param strategy
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /*
     * 策略方法
     */
    public void contextInterface(){
        strategy.strategyInterface();
    }
}
