package com.java.lv5;

/**
 * 小兵类
 */
public class Batman{
    private String name;//名称
    private int hp;//生命值
    private int ad;//攻击力
    private int ac;//防御力
    private int id;

    public Batman(int id,String name, int hp, int ad, int ac) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.ad = ad;
        this.ac = ac;
    }

    public void fight(Hero hero){
        int sh = (int)(ad*(1-(double)hero.getAc()/(100+hero.getAc())));//伤害
        System.out.println(this.name+"对"+hero.getName()+"造成了"+sh+"伤害");
        hero.setHp(hero.getHp()-sh);
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


    @Override
    public String toString() {
        return  id + ":"+
                name+"  hp:"+hp;
    }
}
