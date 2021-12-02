package com.practice.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmployeeTester
{
    public static void main(String[] args)
    {
        List<Employee> list = new ArrayList<>();
        Employee employee = new Employee(123 , "Arun" , 30000.0);
        list.add(new Employee(45656 , "Abhishek" , 70000.0));
        list.add(new Employee(342, "Simran" , 80000.0));

        Consumer<Employee> employeeConsumer = e1 -> System.out.println(e1);
        employeeConsumer.accept(employee);

        Predicate<Employee> employeePredicate = e1 -> e1.getSalary() > 40000.0;
        Predicate<Employee> employeePredicate1 = e1 -> e1.getSalary() < 50000.0;

        Predicate<Employee> filter = employeePredicate.and(employeePredicate1);
        for(Employee e : list)
        {
            System.out.println(e.getName() + "'s salary is greater than 40k and less than 50k");
        }

    }

}
