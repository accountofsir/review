package com.demo.observer;

public class TestDemo {

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        MouseCallback target = new MouseCallback();
        mouse.addListener(MouseEventType.on_click, target);
        mouse.trigger(MouseEventType.on_click);
    }
}
