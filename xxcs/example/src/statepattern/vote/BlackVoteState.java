package statepattern.vote;

public class BlackVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager){
        //记录黑名单，禁止登陆系统
        System.out.println("进入黑名单，将禁止登陆和使用本系统");
    }

}
