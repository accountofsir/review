package com.demo.observer;


import com.demo.observer.event.EventListener;

public class Mouse extends EventListener {

    public void click() {
        System.out.println("鼠标单击");
        this.trigger(MouseEventType.on_click);
    }

    public void doubleClick() {
        System.out.println("鼠标双击");
        this.trigger(MouseEventType.on_doubleClick);
    }

    public void focus() {
        System.out.println("鼠标获取焦点击");
        this.trigger(MouseEventType.on_focus);
    }

    public void rightClick() {
        System.out.println("鼠标右击");
        this.trigger(MouseEventType.on_rightClick);
    }

}
