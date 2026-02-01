package com.token.demo03;

import com.token.demo01.Rent;

//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要租房子");
    }
}
