package com.test;

import com.application.ServiceProxy;
import com.service.Service;
import com.service.impl.ServiceImpl;
import org.junit.Test;

/**
 * Created by faith on 16/7/12.
 */
public class TestConcurrent {

    @Test
    public void testBefore() {
        Service s = new ServiceImpl();
        Client c = new Client(s);
        c.requestService();
    }


    @Test
    public void testAfter() {
        Service s = new ServiceProxy();
        Client c = new Client(s);
        c.requestService();
    }
}
