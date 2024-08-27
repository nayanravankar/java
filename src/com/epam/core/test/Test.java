package com.epam.core.test;

public class Test implements Test2,Test1 {

    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public void hello() {
        Test2.super.hello();
    }


    public static void main(String[] args) {
      /*  Test test = new Test();
        test.hello();*/
        try{

            int a = 10;
        }
        finally {
            System.out.println("finally");
        }
    }
}
