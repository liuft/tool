package com.lft.secretgarden.nio;

/**
 * Created by liufeitian on 16/9/28.
 */
public class TestNio {
    public static void main(String[] argo){
        int c  = 1;
        int b = 2;
        int d = c + 1;
        String abc = "abc";
        String cd = new String("abc");
        System.out.println(b == d);
        System.out.println(abc == cd);
    }

}
