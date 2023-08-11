package org.example;

import org.example.util.ITest;
import org.example.util.TestImpl;

public class Main {
    public static void main(String[] args) {

        ITest test = new TestImpl();

        System.out.println(test.operation("Motilal", "Kumar"));

       // System.out.println("Hello world!");
    }
}