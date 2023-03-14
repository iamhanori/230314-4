package kr.hs.study.beans;

public class BaseBall implements Sports{
    public String name(){
        String name = "야구";
        return name;
    };
    public int player() {
        int player = 6;
        return player;
    };
    public void rule(){
        System.out.println("공을 던져요!");
    }
}
