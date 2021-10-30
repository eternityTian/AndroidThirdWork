package com.java.lv0;

/**
 * @author zhihong
 * @id 2021211945
 */
public class Box {
    private double height;//高
    private double wide;//宽
    private double bearing;//盒子承重量

    private boolean state = false;//盒子门状态（是否打开）
    private boolean empty = true;//盒子空

    private String type;//箱子种类

    public Box(String type,double height,double wide,double bearing){
        this.type = type;
        this.height = height;
        this.wide = wide;
        this.bearing = bearing;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public String getType() {
        return type;
    }

    public double getBearing() {
        return bearing;
    }


    public double getWide() {
        return wide;
    }

    public double getHeight() {
        return height;
    }


    //判断箱子门状态
    public boolean isState() {
        return state;
    }

    public void openBox(){//开盒子
        if (state) {//如果已经是开的，无需再开
            System.out.println(type+"的门已经打开了，无需再开");
        }else {
            state = true;
            System.out.println(type+"的门被打开了");
        }
    }

    public void closeBox(){
        if (state) {//如果盒子是开的，关闭盒子。否则无需再关
            state = false;
            System.out.println(type+"的门被关闭了");
        }
    }
}
