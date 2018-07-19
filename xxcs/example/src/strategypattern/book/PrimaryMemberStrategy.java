package strategypattern.book;

public class PrimaryMemberStrategy implements MemberStrategy{

    @Override
    public double calcPrice(double booksPrice){
        System.out.println("对于初级会员没有折扣");
        return booksPrice;
    }
}
