package com.driver;

import jdk.dynalink.beans.StaticClass;

public class Main {

    static class A{

        public String meth(){
            return "invoking method from class A";
        }
    }

    static class B extends A{

        @Override
        public String meth(){
            return "Method in extendend class B";
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.meth();

        B b1 = new B();
        b1.meth();
    }
}