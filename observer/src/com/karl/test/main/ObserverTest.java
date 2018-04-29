package com.karl.test.main;

import com.karl.test.callback.MouseClickCallback;
import com.karl.test.callback.MouseEventCallback;
import com.karl.test.entity.Mouse;
import com.karl.test.entity.MouseEvent;
import com.karl.test.entity.WirelessMouse;
import com.karl.test.handler.MouseEventListener;
import com.karl.test.handler.MouseHandler;

import java.lang.reflect.Method;

public class ObserverTest {

    public static void main(String[] args) {
        try {
            //创建鼠标事件监听器
            MouseEventListener listener = new MouseEventListener();
            //获取鼠标事件回调方法
            Method clickCallback = MouseClickCallback.class.getMethod("callback", new Class[]{MouseEvent.class});
            MouseEventCallback mouseClickCallback = new MouseClickCallback();
            MouseHandler handler = new MouseHandler();
            Mouse mouse = (Mouse)handler.newInstance(new WirelessMouse());

            //添加鼠标监听事件
            handler.addListener("click", mouseClickCallback, clickCallback);
            mouse.click();

            //移除鼠标监听事件
            handler.removeListener("click");
            mouse.click();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
