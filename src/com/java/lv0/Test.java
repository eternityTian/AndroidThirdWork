package com.java.lv0;


public class Test {
    public static void main(String[] args) {
        Elephant e1 = new Elephant(200,100,150);//创建一个大象实例
        Oven oven1 = new Oven(200,150,200);//创建一个烤箱示例

        //打开烤箱
        oven1.openBox();
        //将大象装进烤箱
        e1.enterBox(oven1);
        //调节烤箱温度
        oven1.setTemperature(120);
        //尝试重复打开烤箱门
        oven1.openBox();
        //关闭烤箱门,并调温
        oven1.closeBox();
        oven1.setTemperature(120);
        //尝试烤大象
        oven1.backThing(e1);
        //重新调节温度
        oven1.setTemperature(230);
        //第二次尝试烤大象
        oven1.backThing(e1);
        //测试烤熟的大象能不能再次被烤
        oven1.backThing(e1);

        /**
         * 停了在不扩展了 - -
         */


    }
}
