package kr.hs.study;

import kr.hs.study.beans.BaseBall;
import kr.hs.study.beans.Sports;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

    }
}