package com.java.lv5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 英雄界面
 */
public class HeroList {
    private ArrayList<Hero> heroes;
    public HeroList(){//初始英雄
        heroes = new ArrayList<>();
        heroes.add(new Hero("流浪法师",672,52,18));
        heroes.add(new Hero("寒冰射手",650,65,17));
        heroes.add(new Hero("德玛西亚之力",690,65,24));
    }

    public void addHero(String name,int hp,int ad, int ac){
        heroes.add(new Hero(name,hp,ad,ac));
    }

    public Hero selectHero(){
        System.out.println("--------------可选英雄------------");
        for(Hero hero:heroes) System.out.println(hero.toString());//查看可选英雄
        System.out.println("---------------------------------");

        Hero ensureHero = null;
        while (ensureHero == null){
            System.out.println("请选择你的英雄");
            String name = new Scanner(System.in).nextLine();
            for (Hero hero:heroes){//遍历搜寻该英雄是否在英雄池
                if (hero.getName().equals(name)) {//英雄池存在该英雄则把英雄返回
                    ensureHero = hero;
                }
             }
            if (ensureHero == null) {
                System.out.println("该英雄未拥有，请重新输入");
            }
        }
        System.out.println("---------------------------------");
        return ensureHero;
    }

}
