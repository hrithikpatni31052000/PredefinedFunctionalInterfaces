package com.example;

import java.util.function.Function;

public class FunctionFunctionalInterfaceExample
{
    public static void main(String[] args)
    {
        Function<String , Integer> function = (s) -> s.length();
        System.out.println("Length of String - " + function.apply("Interface"));
    }
}
