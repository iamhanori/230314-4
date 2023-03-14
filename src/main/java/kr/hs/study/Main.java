package kr.hs.study;

import kr.hs.study.beans.BaseBall;
import kr.hs.study.beans.Soccer;
import kr.hs.study.beans.Sports;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.channels.spi.SelectorProvider;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        // baseball 객체 불러오기
        Sports baseball = ctx.getBean("baseball", BaseBall.class);
        System.out.println(baseball.name()); // baseball 이름
        System.out.println(baseball.player()+"명"); // baseball 참여 인원
        baseball.rule(); // baseball 룰

        // soccer 객체 불러오기
        Sports soccer = ctx.getBean("soccer", Soccer.class);
        System.out.println(soccer.name()); // soccer 이름
        System.out.println(soccer.player()+"명"); // soccer 참여 인원
        soccer.rule(); // soccer 룰

    }
}