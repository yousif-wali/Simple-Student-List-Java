package main;

public class Student {
    public String name;
    public static int _id;

    public Student(String name) {
        this.name = name;
        _id++;
    }
}
