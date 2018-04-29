package com.karl.test.callback;

import com.karl.test.entity.MouseEvent;

public class MouseOnCallback implements  MouseEventCallback{
    @Override
    public void callback(MouseEvent event) {
        //System.out.println("{" + event.getTime() + ", " + event.getSource() + ", " + event.getTrigger() + ", " + event.getTarget() + ", " + event.getCallback() + "}");
        System.out.println(event);
    }
}
