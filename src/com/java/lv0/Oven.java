package com.java.lv0;

/**
 * 烤箱类
 * @author zhihong
 * @id 2021211945
 */
public class Oven extends Box {

    private double temperature = 20;//温度,默认20摄氏度

    /**
     * 创建Oven实例必将盒子类型设为烤箱
     */
    public Oven(double height,double wide,double bearing) {
        super("烤箱", height, wide, bearing);
    }

    /**
     * 调节温度
     * @param temperature 温度
     */
    public void setTemperature(double temperature) {
        if (isState()) {//烤箱门是开的不能调节温度
            System.out.println("烤箱门未关闭，调节温度会造成危险，不允许调节温度");
        }else{
            System.out.println(getType()+"温度被调节到了"+temperature+"摄氏度");
            this.temperature = temperature;
        }

    }

    /**
     * 烤动物
     * @param animal 动物
     */
    public void backThing(Animal animal){
        if (isState()) {//判断烤箱门未关闭
            System.out.println("烤箱门未关闭，不能加热");
        }else {
            if (isEmpty()) {//判断烤箱是不是空
                System.out.println("烤箱是空的哎，没有东西烤");
            }else {
                if (temperature > 200) {//温度大于200才能烤肉
                    if (animal.isRaw()) {//动物是生的才能烤
                        animal.setRaw(false);//设置动物不是生的
                        System.out.println(animal.getType()+"被烤熟了");
                    }else {
                        System.out.println(animal.getType()+"已经是熟的了,不用再烤");
                    }
                }else{//温度小于等于200提示温度不够
                    System.out.println("温度不够，烤不熟");
                }
            }
        }


    }
}
