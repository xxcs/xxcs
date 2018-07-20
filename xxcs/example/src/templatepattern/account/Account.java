package templatepattern.account;

import strategypattern.example.Strategy;

public abstract class Account {
    /**
     * 计算存款利息
     * 不同账号的存款利息是不同的
     */

    public final double calculateInterest(){
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType);

        return amount * interestRate;
    }

    /**
     * 基本方法留给子类实现
     */
    protected abstract String doCalculateAccountType();
    /**
     * 基本方法留给子类实现
     */
    protected abstract double doCalculateInterestRate();

    /**
     * 基本方法，已经实现
     */
    private double calculateAmount(String accountType){
        /**
         * 省略相关逻辑
         */
        return 7243.00;
    }
}
