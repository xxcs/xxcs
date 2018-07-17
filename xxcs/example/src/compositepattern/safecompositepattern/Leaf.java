package compositepattern.safecompositepattern;

public class Leaf implements Component {
    /**
     * 叶子对象的名字
     */
    private String name;

    /**
     * 构造方法，传入叶子对象的名称
     * @param name 叶子对象的名称
     */
    public Leaf(String name){
        this.name = name;
    }

    /**
     *
     */
    @Override
    public void printStruct(String preStr){
        // TODO Auto-generated method stub
        System.out.println(preStr + "-" + name);
    }
}
