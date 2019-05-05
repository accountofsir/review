package com.demo.delegate;

public class Boss {

    public void startGan(String cmd, Leader leader) {
        leader.doing(cmd);
    }
}
