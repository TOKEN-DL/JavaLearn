package com.token.utils;


import org.testng.annotations.Test;

import java.util.UUID;

@SuppressWarnings("all") //抑制警告
public class IDutild {


    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void test(){
        System.out.printf(IDutild.getId());
        System.out.printf(IDutild.getId());
        System.out.printf(IDutild.getId());
        System.out.printf(IDutild.getId());
    }


}
