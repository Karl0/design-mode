package com.karl.test.entity;

public class WirelessMouse implements Mouse {

    @Override
    public void click(){
        System.out.println("鼠标单击");
    }

    @Override
    public void down(){
        System.out.println("鼠标按下");
    }

    @Override
    public void up(){
        System.out.println("鼠标松开");
    }

    @Override
    public void rightClick(){
        System.out.println("鼠标右击");
    }

    @Override
    public void doubleClick(){
        System.out.println("鼠标双击");
    }

    @Override
    public void onmouseover(){
        System.out.println("鼠标覆盖");
    }

    @Override
    public void wheel(){
        System.out.println("鼠标滚动");
    }

}
