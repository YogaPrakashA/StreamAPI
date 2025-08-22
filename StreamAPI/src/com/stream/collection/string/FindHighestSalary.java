package com.stream.collection.string;

import com.stream.collection.Employee;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class FindHighestSalary {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(1, "arun", "Dev", 100000);
        Employee e2 = new Employee(2, "ajith", "UAT", 100);
        Employee e3 = new Employee(3, "mani", "Dev", 10000);
        Employee e4 = new Employee(4, "kumar", "SIT", 10500);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        Optional<Employee> minSalary = list.stream().min(Comparator.comparing(Employee::salary));
        Optional<Employee> maxSalary = list.stream().max(Comparator.comparing(Employee::salary));

        if (minSalary.isPresent())
            System.out.println(minSalary.get());

        if (maxSalary.isPresent())
            System.out.println(maxSalary.get());

    }
}
