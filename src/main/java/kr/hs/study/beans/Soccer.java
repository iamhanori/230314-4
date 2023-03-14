package kr.hs.study.beans;

public class Soccer implements Sports{
    public String name(){
        String name = "축구";
        return name;
    };
    public int player() {
        int player = 11;
        return player;
    };
    public void rule(){
        System.out.println("공을 차요!");
    }
}
