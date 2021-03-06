package mementopattern.multiplecheckpoint;

import java.util.ArrayList;
import java.util.List;

public class  Originator {
    private List<String> states;
    //检查点数
    private int index;

    /**
     * 构造函数
     */
    public Originator(){
        states = new ArrayList<String>();
        index = 0;
    }

    /**
     * 工厂方法，返还一个新的备忘录对象
     */
    public Memento createMemento(){
        return new Memento(states, index);
    }

    public void restoreMemento(Memento memento){
        states = memento.getStates();
        index = memento.getIndex();
    }

    /**
     * 赋值方法
     */
    public void setState(String state){
        states.add(state);
        index++;
    }

    /**
     * 辅助方法，打印所有的状态
     */
    public void printStates(){
        for(String state : states){
            System.out.println(state);
        }
    }


}
