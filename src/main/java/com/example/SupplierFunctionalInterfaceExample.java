package com.example;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierFunctionalInterfaceExample
{
    public static void main(String[] args)
    {
        Supplier<LocalDateTime> currDateTime = () -> LocalDateTime.now();
        System.out.println(currDateTime.get());
    }
}
