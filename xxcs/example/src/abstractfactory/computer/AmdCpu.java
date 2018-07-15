package abstractfactory.computer;

public class AmdCpu implements Cpu{

    /*
     * CPU的针脚数
     */
    private int pins = 0;
    public  AmdCpu(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate(){
        // TODO Auto-generated method stub
        System.out.println("Amd CPU的针脚数：" + this.pins);
    }
}
