package templatepattern.account;

public class MoneyMarketAccount extends Account {

    @Override
    protected String doCalculateAccountType(){
        return "Monkey Market";
    }

    @Override
    protected double doCalculateInterestRate(){
        return 0.045;
    }
}