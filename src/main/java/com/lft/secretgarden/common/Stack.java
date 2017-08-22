package com.lft.secretgarden.common;

import java.util.Stack;

/**
 * Created by liufeitian on 17/6/15.
 */
class StackStick{
    private Stack<java.lang.Integer> arry = new Stack<java.lang.Integer>();
    private Stack<java.lang.Integer> min = new Stack<java.lang.Integer>();
    private int min_value = 0;
    public int min(){
        return min.peek();
    }

    public void push(int m){
        if(arry.size() == 0){
            min_value = m;
        }
        if(m < min_value){
            min_value = m;
        }
        min.push(min_value);
        arry.push(m);
    }
    public java.lang.Integer pop(){
       if(arry != null){
           min.pop();
           return arry.pop();
       }
       return null;
    }
}
