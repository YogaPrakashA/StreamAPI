package com.stream.collection.string;

import com.stream.collection.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class SortValuesByMultipleFields {
    public static void main(String[] args) {

        Function<String, String> convertUpper = String::toLowerCase;
        List<Employee> listOfEmployee = Arrays.asList(new Employee(1, "prakash", "Dev", 10000), new Employee(2, "yoga", "Dev", 100000)
                , new Employee(3, "Raj", "SDev", 105000), new Employee(4, "arun", "HR", 10000), new Employee(5, "kumar", "Testing", 20000));

        listOfEmployee.stream()
                .sorted(Comparator.comparing(Employee::emp_name)
                        .thenComparing(Employee::depart)
                        .thenComparing(Employee::salary))
                .forEach(System.out::println);


    }
}
