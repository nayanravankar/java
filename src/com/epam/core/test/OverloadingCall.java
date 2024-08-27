package com.epam.core.test;

/*
*
* Method Overloading with Null
Primitive Type int:

The method cal(int a) accepts a primitive int type, and null cannot be assigned to a primitive type. Therefore, this method is not considered by the compiler when null is passed as an argument.
Reference Type String:

The method cal(String a) accepts a reference type String. null can be assigned to any reference type, so this method is a valid candidate when null is passed.
* */

public class OverloadingCall {

    public static void main(String[] args) {
        OverloadingCall overloadingCall = new OverloadingCall();
        overloadingCall.cal(null);
    }

    // changing int to Integer will cause compile time error
     void cal(int a){
        System.out.println("In int param method");
    }

     void cal(String a){
        System.out.println("In string param method");
    }
}
