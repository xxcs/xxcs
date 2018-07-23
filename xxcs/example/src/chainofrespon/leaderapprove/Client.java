package chainofrespon.leaderapprove;

public class Client {
    public static void main(String[] args){
        //先要组装责任链

        Handler h1 = new GeneralManager();
        Handler h2 = new DeptManager();
        Handler h3 = new ProjectManager();

        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        //开始测试
        String test1 = h3.handleRequest("张三", 300);
        System.out.println("test1 = " + test1);
    }
}
