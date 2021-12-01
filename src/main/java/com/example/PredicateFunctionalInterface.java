package com.example;

import java.util.function.Predicate;

public class PredicateFunctionalInterface
{
    public static void main(String[] args)
    {
        Predicate<Integer> predicate = (n) -> n%2 == 0;
        boolean val = predicate.test(5);
        System.out.println("Is Even - " + val);
        System.out.println("Is Even - " + predicate.test(16));
    }
}
