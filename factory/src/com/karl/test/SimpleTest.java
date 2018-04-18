package com.karl.test;

import com.karl.test.abst.AbstractFactory;
import com.karl.test.abst.AdidasFactory;
import com.karl.test.abst.NickFactory;
import com.karl.test.entity.Shoes;
import com.karl.test.func.FunctionFactory;

public class SimpleTest {

    /**
     * 抽象工厂模式测试
     */
    public static void testAbst(){
        // 选择鞋子品牌
        AbstractFactory factory1 = new AdidasFactory();
        System.out.println(factory1);
        // 选择鞋子尺码
        Shoes shoes1 = factory1.makeShoes39();
        System.out.println(shoes1);
        Shoes shoes2 = factory1.makeShoes40();
        System.out.println(shoes2);

        // 选择鞋子品牌
        AbstractFactory factory2 = new NickFactory();
        System.out.println(factory2);
        // 选择鞋子尺码
        Shoes shoes3 = factory2.makeShoes39();
        System.out.println(shoes3);
        Shoes shoes4 = factory2.makeShoes40();
        System.out.println(shoes4);
    }

    /**
     * 工厂方法模式测试
     */
    public static void testFunc(){
        //选择品牌
        FunctionFactory factory1 = new com.karl.test.func.AdidasFactory();
        System.out.println(factory1);
        Shoes shoes1 = factory1.makeShoes();
        System.out.println(shoes1);

        //选择品牌
        FunctionFactory factory2 = new com.karl.test.func.NickFactory();
        System.out.println(factory2);
        Shoes shoes2 = factory2.makeShoes();
        System.out.println(shoes2);
    }

}
