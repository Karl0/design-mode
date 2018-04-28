package com.karl.test.callback;

import com.karl.test.entity.MouseEvent;

public class MouseClickCallback implements MouseEventCallback{
    @Override
    public void callback(MouseEvent event) {
        System.out.println("{" + event.getTime() + ", " + event.getSource() + ", " + event.getTrigger() + ", " + event.getTarget() + ", " + event.getCallback() + "}");
    }
}
