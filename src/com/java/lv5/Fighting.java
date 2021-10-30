package com.java.lv5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 战斗进程相关
 */
public class Fighting {
    private ArrayList<Batman> batmen = new ArrayList<>();
    public void init(Hero hero){

        batmen.add(new PaoBin(1));
        batmen.add(new JinZhan(2));
        batmen.add(new SuperBatman(3));
        batmen.add(new JinZhan(40));

        while (true){
            for(Batman batman:batmen){
                if (batman == null) {
                    continue;
                }
                System.out.println(batman.toString());
            }//展示对抗的小兵
            System.out.println(hero.toString());//打印当前英雄状态
            heroFight(hero);//英雄进行攻击
            System.out.println("-------------轮到小兵攻击-----------------");
            BatmanFight(hero);
            boolean temp = true;//判断所有小兵是否全部死亡
            for(Batman batman : batmen){
                if (batman!=null){ temp=false;break;}
            }
            if (temp) {//全部死亡结束游戏
                System.out.println("敌方小兵全部阵亡，游戏胜利");
                break;
            }
            System.out.println("------------ -轮到你了--------------------");
        }


    }

    private void heroFight(Hero hero){
        System.out.println("请选择你要攻击的对象(输入序号)：");
        int aim = new Scanner(System.in).nextInt();
        System.out.println("--------------------------------------------");
        System.out.println(hero.getName()+"对"+batmen.get(aim-1).getName()+"进行了攻击");
        hero.fight(batmen.get(aim-1));

    }

    private void BatmanFight(Hero hero){
        System.out.println(batmen.size());
        for(int i = 0;i<batmen.size();i++){
            if (batmen.get(i)==null) continue;//如果该小兵死亡，跳出此次
            batmen.get(i).fight(hero);
            if (hero.getHp() <= 0) {
                System.out.println("英雄死亡，战斗结束");
                System.exit(0);
            }else {
                hero.beatBack(batmen.get(i));//反击
                if (batmen.get(i).getHp() <= 0) {
                    System.out.println("---------------------------------------------");
                    System.out.println(batmen.get(i).getName()+"死亡");
                    batmen.set(i,null);
                    System.out.println("---------------------------------------------");
                }
            }
        }
    }
}
