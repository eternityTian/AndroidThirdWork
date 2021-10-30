package com.java.lv0;

/**
 * @author zhihong
 * @id 2021211945
 */
public class Animal {
    private double height;//高
    private double wide;//宽
    private double weight;//体重
    private String type;//种类
    private boolean raw = true;//默认动物是生的，没经过烧烤

    public Animal(String type,double height,double wide,double weight){//设置动物种类
        this.type = type;
        this.wide = wide;
        this.height = height;
        this.weight = weight;
    }

    public boolean isRaw() {
        return raw;
    }

    public void setRaw(boolean raw) {
        this.raw = raw;
    }

    //将动物装进盒子
    public void enterBox(Box box){
        if (box.isState()) {//如果盒子门是打开的，才能装动物
            if (box.isEmpty()) {//如果盒子是空的才能装入东西
                if (height > box.getHeight() || wide > box.getWide() || weight > box.getBearing()) {//如果动物过大或太重装不下
                    System.out.println(type+"太大或太重，装不下");
                }else {
                    box.setEmpty(false);//盒子不为空
                    System.out.println("一只"+type+"被装进了"+box.getType());
                }
            }else {
                System.out.println("该"+box.getType()+"已经满了，装不下东西");
            }
        }else{//提示盒子门没打开
            System.out.println(box.getType()+"的门没打开");
        }
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public double getWide() {
        return wide;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
