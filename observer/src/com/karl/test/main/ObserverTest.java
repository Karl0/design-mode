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
        MouseEventListener listener = new MouseEventListener();
        try {
            Method clickCallback = MouseClickCallback.class.getMethod("callback", new Class[]{MouseEvent.class});
            MouseEventCallback mouseClickCallback = new MouseClickCallback();
            MouseHandler handler = new MouseHandler();
            handler.addListener("click", mouseClickCallback, clickCallback);

            Mouse mouse = (Mouse)handler.newInstance(new WirelessMouse());
            mouse.click();
            //mouse.up();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
