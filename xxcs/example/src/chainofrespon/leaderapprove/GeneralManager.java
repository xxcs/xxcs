package chainofrespon.leaderapprove;

public class GeneralManager extends Handler {

    @Override
    public String handleRequest(String user, double fee) {
        String str = "";

        if (fee >= 1000) {
            str = "成功：总经理同意【" + user + "】的聚餐费用，金额为" + fee + "元。";
        } else {
            if (getSuccessor() != null) {
                return getSuccessor().handleRequest(user, fee);
            }
        }

        return str;

    }
}
