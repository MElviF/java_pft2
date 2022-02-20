package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alexei");

    }

    public static void hello(String somebody) {
        System.out.println("Hello, "  + somebody + "!");
    }
    public static double area (double len) {
        return len * len;
    }
    public static double area (double a, double b) {
        return a * b;
    }

}