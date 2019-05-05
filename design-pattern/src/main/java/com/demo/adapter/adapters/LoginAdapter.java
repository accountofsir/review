package com.demo.adapter.adapters;

import com.demo.util.Result;

public interface LoginAdapter {

    boolean support(LoginInterface obj);

    Result login(String id, LoginInterface adapter);
}
