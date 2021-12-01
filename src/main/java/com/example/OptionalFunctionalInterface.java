package com.example;

import java.util.function.UnaryOperator;

public class OptionalFunctionalInterface
{
    public static void main(String[] args)
    {
        UnaryOperator<Integer> unaryOperator = (n) -> n*n;
        System.out.println("4 square = " + unaryOperator.apply(4));
        System.out.println("6 square = " + unaryOperator.apply(6));

    }
}
