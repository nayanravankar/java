package com.epam.core;

class MyExcpetion1 extends Exception{}
class MyExcpetion2 extends Exception{}


public class ExcpetionHandling {

    public static void main(String[] args) throws Exception {
        try {
            System.out.println("1");
            method2();
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
            throw new MyExcpetion2();
        }
        finally {
            System.out.println("main finally");
            throw new MyExcpetion1();
        }
    }

    public static void method2() throws Exception {
        try{
            System.out.println("method2 1");
            throw new MyExcpetion1();
        }
        catch (Exception e){
            System.out.println("method2 exception");
            throw new MyExcpetion2();
        }
        finally {
            System.out.println("method2 finally");
            throw new Exception();
        }
    }
}
