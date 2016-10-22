package com.mochen.dubbo;

/**
 * Created by Administrator on 2016/10/9.
 */
public class TestServiceImpl implements ITestService {
    @Override
    public String test() {
        return "this is just a test!";
    }
}
