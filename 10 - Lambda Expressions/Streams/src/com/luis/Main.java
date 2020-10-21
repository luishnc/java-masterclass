package com.luis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49","g46",
                "I76", "I40"
                );

        List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(number -> {
//            if(number.toUpperCase().startsWith("G")){
//                gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
//        gNumbers.sort(( s1,  s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s) -> System.out.println(s));

        //now using Stream
        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> ioNumberString = Stream.of("I26", "I17","I29","O71");
        Stream<String> inNumberStream = Stream.of("N40","N36", "I36", "I17",  "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberString,inNumberStream);
        System.out.println("-------------------------------------");
//        System.out.println(concatStream.distinct().count());
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());


        //Flat Map
        Employee john = new Employee("John Doe", 30);
        Employee luis = new Employee("Luis N", 27);
        Employee vivian = new Employee("Vivian R", 25);
        Employee jack = new Employee("Jack Hill", 40);

        Department hr = new Department("Human Resources");
        hr.addEmployee(john);
        hr.addEmployee(luis);
        hr.addEmployee(vivian);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(jack);

        List<Department> departments= new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        System.out.println("-------------------------------------");
        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for (String s: sortedGNumbers
             ) {
            System.out.println(s);

        }

        Map<Integer, List<Employee>> groupByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1,e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        System.out.println("-------------------------------------");
        Stream.of("ABC", "AC", "BAA", "CCC", "XI", "ST")
                .filter(s ->{
                    System.out.println(s);
                    return s.length() == 3;
        }).count();
    }
}
