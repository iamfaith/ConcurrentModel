package com.concurrent;

/**
 * Created by faith on 16/7/12.
 */
//一个ActiveObject类，从Thread继承，封装了并发逻辑的活动对象
//        一个ActiveQueue类，主要用来存放调用者请求
//        一个MethodRequest接口，主要用来封装调用者的请求，Command设计模式的一种实现方式
public class ActiveObject extends Thread
{
    public ActiveObject() {
        _queue = new ActiveQueue();
        start();
    }
    public void enqueue(MethodRequest mr) {
        _queue.enqueue(mr);
    }
    public void run() {
        while(true) {
            MethodRequest mr = _queue.dequeue();
            mr.call();
        }
    }
    private ActiveQueue _queue;
}