package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceExample
{
    public static void main(String[] args)
    {
        Consumer<String> consumer = s -> System.out.println(s);
        List<String> alphaList = Arrays.asList("A" , "B" , "C" , "D");
        for(String str : alphaList)
        {
            //functional interface accept() method called
            consumer.accept(str);
        }

        Consumer<Integer> consumer1 = a -> System.out.println(a);
        List<Integer> integerList = Arrays.asList(1 ,2 , 3 ,4);
        for(Integer int1 : integerList)
        {
            consumer1.accept(int1);
        }
    }
}
