package com.heima;

import java.util.LinkedList;

/**
 * Author: Zhouzw
 * Date: 2025/4/22 18:29
 */
class Demo{
    public int add (int a, int b){
        try {
            return a+b;
        }catch (Exception e){
            System.out.println("catch 语句块");
        }finally {
            System.out.println("finally 语句块");
        }
        return 0;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.add (1,2));
    }
}
public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
    }
}
