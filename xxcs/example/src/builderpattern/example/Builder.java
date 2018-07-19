package builderpattern.example;

public interface Builder {
    /**
     * 抽象构造者类Builder
     */
    public void buildPart1();
    public void buildPart2();
    public Product retrieveResult();
}
