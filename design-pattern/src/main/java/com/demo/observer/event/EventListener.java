package com.demo.observer.event;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class EventListener {


    private static final ConcurrentHashMap<String, Event> events = new ConcurrentHashMap<>();

    /*
     * 添加监听类型*/
    public boolean addListener(String trigger, Object target) {
        try {
            Method method = target.getClass().getMethod(getMethodName(trigger), Event.class);
            Event event = new Event()
                    .setCallback(method).setTarget(target).setTrigger(trigger);
            events.put(trigger, event);
            return true;
        } catch (NoSuchMethodException e) {
            log.error("没有该方法...", e);
        }
        return false;
    }

    private String getMethodName(String trigger) {
        return "on" + trigger.substring(0, 1).toUpperCase() + trigger.substring(1);
    }

    /**
     * 触发
     */
    public Object trigger(String trigger) {
        Event event = events.get(trigger);
        if (event == null) {
            return null;
        }
        event.setTime(System.currentTimeMillis()).setSource(this);
        try {
            return event.getCallback().invoke(event.getTarget(), event);
        } catch (IllegalAccessException e) {
            log.error("IllegalAccessException error:", e);
        } catch (InvocationTargetException e) {
            log.error("InvocationTargetException errors:", e);
        }
        return null;
    }

}
