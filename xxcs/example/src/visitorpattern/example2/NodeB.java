package visitorpattern.example2;

public class NodeB extends Node {

    /**
     * 接受操作
     */
    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    /**
     * NodeA特有的方法
     */
    public String operationB(){
        return "NodeB";
    }
}
