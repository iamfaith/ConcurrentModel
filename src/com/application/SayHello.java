package com.application;

import com.concurrent.MethodRequest;
import com.service.Service;

/**
 * Created by faith on 16/7/12.
 */
class SayHello implements MethodRequest
{
    public SayHello(Service s) {
        _service = s;
    }
    public void call() {
        _service.sayHello();
    }
    private Service _service;
}
