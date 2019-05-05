package com.demo.observer;

import com.demo.observer.event.Event;

public class MouseCallback {

    public void onClick(Event event) {
        System.out.println("---单击---");
        System.out.println(event);
    }

    public void onDoubleClick(Event event) {
        System.out.println("----双击----");
        System.out.println(event);
    }

    public void onRightClick(Event event) {
        System.out.println("----右击-----");
        System.out.println(event);
    }
}
