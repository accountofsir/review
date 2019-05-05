package com.demo.delegate;

public class Leader {
    private IEmployee delegate;
    public Leader(IEmployee delegate) {
        this.delegate = delegate;
    }

    public void doing(String cmd) {
        delegate.doing(cmd);
    }
}
