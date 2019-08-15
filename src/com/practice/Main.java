package com.practice;

import com.practice.data_structures.linked_list.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        System.out.println(list.isEmpty());

        list.add("Sam");
        list.add("Aman");
        list.add("Clive");
        list.add("Sahil");

        System.out.println(list);

        LinkedList<Person> intList = new LinkedList<Person>();
        intList.add(new Person("sam", "david", 23));
        intList.add(new Person("clive", "rod", 23));
        intList.add(new Person("aman", "dave", 23));

        System.out.println(intList);

//        list.add();
    }
}

class Person {
    private String FirstName;
    private String LastName;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
