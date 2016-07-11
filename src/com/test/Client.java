package com.test;

import com.service.Service;

/**
 * Created by faith on 16/7/12.
 */
public class Client {
    public Client(Service s) {
        _service = s;
    }

    public void requestService() {
        _service.sayHello();
    }

    private Service _service;
}
