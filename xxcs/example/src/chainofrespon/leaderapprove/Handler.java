package chainofrespon.leaderapprove;

public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public Handler getSuccessor(){
        return this.successor;
    }

    /**成功或失败的具体通知
     * 处理聚餐费的申请
     * @param user 申请人
     * @param fee 申请的钱数
     * @return
     */
    public abstract String handleRequest(String user, double fee);
}
