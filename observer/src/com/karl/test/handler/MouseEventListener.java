package com.karl.test.handler;

import com.karl.test.entity.MouseEvent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MouseEventListener {

    protected Map events = new HashMap();

    public void addListener(String eventType, Object target, Method callback){
        events.put(eventType, new MouseEvent(target, callback));
    }

    public void removeListener(String eventType){
        if(events.containsKey(eventType)){
            events.remove(eventType);
        }
    }

    protected void trigger(String eventType){
        if(!this.events.containsKey(eventType)){
            return;
        }
        MouseEvent mouseEvent = (MouseEvent)this.events.get(eventType);
        mouseEvent.setTrigger(eventType);
        mouseEvent.setSource(this);
        mouseEvent.setTime(System.currentTimeMillis());
        try {
            mouseEvent.getCallback().invoke(mouseEvent.getTarget(), mouseEvent);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}