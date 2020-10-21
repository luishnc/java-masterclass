package com.luis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee luis = new Employee("Luis Nasser", 27);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red White", 35);
        Employee charming = new Employee("Charming Brown", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(luis);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        //Function interface
        Function<Employee, String> getLastName = (Employee employee ) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employees.get(1));
        System.out.println(lastName);

        Function <Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

        Random random1 = new Random();
        System.out.println("===============================");
        for (Employee employee: employees
             ) {
            if(random1.nextBoolean()){
                System.out.println(getAName(getFirstName,employee));

            } else {
                System.out.println(getAName(getLastName, employee));
            }
        }

        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));
        Function chainedFunction = upperCase.andThen(firstName);

        System.out.println(chainedFunction.apply(employees.get(0)));

        //BiFunction
        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> {
            return name.concat(" " + employee.getAge());
        };

        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName,employees.get(0)));

        IntUnaryOperator intBy5 = i -> i+5;
        System.out.println(intBy5.applyAsInt(10));

        Consumer<String> c1 = s -> s.toUpperCase();
        Consumer<String> c2 = s -> System.out.println(s);
        c1.andThen(c2).accept("Hello World!");


//
//        printEmployeesByAge(employees,"Employees over 30", employee -> employee.getAge() > 30);
//        printEmployeesByAge(employees,"\nEmployees 30 and under", employee -> employee.getAge() <= 30);
//        printEmployeesByAge(employees, "\nEmployees younger than 25", new Predicate<Employee>() {
//            @Override
//            public boolean test(Employee employee) {
//                return employee.getAge() < 25;
//            }
//        });
//
//        IntPredicate greaterThan15 = i -> i > 15;
//        IntPredicate lessThan100 = i -> i < 100;
//        System.out.println("\n" + greaterThan15.test(10));
//        int a = 20;
//        System.out.println(greaterThan15.test(a + 5));
//
//        System.out.println(greaterThan15.and(lessThan100).test(10));
//
//        System.out.println("\n\nSupplier");
//        Random random = new Random();
//        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(randomSupplier.get());
//
//        }

//        employees.forEach(employee -> {
//            String lastName = employee.getName().substring(employee.getName().indexOf(' ') + 1);
//            System.out.println("Last Name: " + lastName);
//        });



    }

    private static String getAName(Function<Employee, String> getName, Employee employee){
        return getName.apply(employee);

    }

    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText, Predicate<Employee> ageCondition){
        System.out.println(ageText);
        System.out.println("===================");
        for (Employee employee: employees
             ) {
            if(ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }

    }
}