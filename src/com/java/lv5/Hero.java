package com.java.lv5;

/**
 * 英雄类
 */
public class Hero implements FightInterface{
    private String name;//名称
    private int hp;//生命值
    private int ad;//攻击力
    private int ac;//防御力

    private FightInterface enemy;

    public Hero(String name, int hp, int ad, int ac) {
        this.name = name;
        this.hp = hp;
        this.ad = ad;
        this.ac = ac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    /**
     * 重写toString方法，返回英雄介绍
     * @return
     */
    @Override
    public String toString() {
        return  name + ' ' +
                "生命值" + hp +
                " 攻击力" + ad +
                " 防御力" + ac ;
    }

    @Override
    public void beatBack(Batman batman) {//反击伤害=正常伤害*50%
        int sh = (int)(ad*(1-(double)batman.getAc()/(100+batman.getAc())));//伤害
        System.out.println(this.name+"对"+batman.getName()+"进行反击，造成"+sh/2+"伤害");
        batman.setHp(batman.getHp()-sh/2);
    }

    public void fight(Batman batman){
        int sh = (int)(ad*(1-(double)batman.getAc()/(100+batman.getAc())));//伤害
        System.out.println(this.name+"对"+batman.getName()+"造成了"+sh+"伤害");
        batman.setHp(batman.getHp()-sh);
    }

}
