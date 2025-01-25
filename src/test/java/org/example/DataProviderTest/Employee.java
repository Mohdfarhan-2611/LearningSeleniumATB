package org.example.DataProviderTest;

import org.testng.annotations.DataProvider;

public class Employee {

    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @DataProvider
    public static Employee[] getData2()
    {
        return new Employee[] {
                new Employee("Farhan", 123),
                new Employee("Tayyab", 12)
        };

    }





}
