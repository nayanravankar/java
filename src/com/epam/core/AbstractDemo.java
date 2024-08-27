package com.epam.core;

/*An abstract class cannot be instan􀆟ated, which means you are not allowed to create an object of the abstract class.
        This also means, an abstract class has no use unless it is
        extended by some other class
    - If there is any abstract method in a class then that class
    must be declared abstract
    - The first non-abstract class which is extending from an
    abstract class will have to give implementa􀆟on of the
    abstract methods defined in abstract class

*/

public abstract class AbstractDemo {

    public static void main(String[] args) {
        System.out.println("in abs");
    }

    abstract void print();

    public  void display(){
        System.out.println("in display method of abs");
    }
}


class AbsImpl extends AbstractDemo {

    @Override
    void print() {
        System.out.println("Impl print");
    }

    public static void main(String[] args) {
        AbstractDemo abs = new AbsImpl();
        abs.display();
    }
}
