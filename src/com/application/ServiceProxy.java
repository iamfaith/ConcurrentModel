package com.application;

import com.concurrent.ActiveObject;
import com.concurrent.MethodRequest;
import com.service.Service;
import com.service.impl.ServiceImpl;

/**
 * Created by faith on 16/7/12.
 */
public class ServiceProxy implements Service
{
    public ServiceProxy() {
        _service = new ServiceImpl();
        _active_object = new ActiveObject();
    }

    public void sayHello() {
        MethodRequest mr = new SayHello(_service);
        _active_object.enqueue(mr);
    }
    private Service _service;
    private ActiveObject _active_object;
}