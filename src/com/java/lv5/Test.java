package com.java.lv5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("----------欢迎进入英雄联盟----------");
        //创建英雄选择界面
        HeroList heroList = new HeroList();
        //选择英雄
        Hero myHero = heroList.selectHero();

        System.out.println("你选择了"+myHero.getName());
        System.out.println("即将进入战斗。。。");

        new Fighting().init(myHero);//开始战斗
        //Batman test1 = new Batman("近战兵",100,50,40);
       // test1.fight(myHero);







    }
}
