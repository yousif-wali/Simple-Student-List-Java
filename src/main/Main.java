package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        System.out.println("========= Welcome to My Single Database ===========");
        System.out.println("Type 1 to add new student");
        System.out.println("Type 2 to search for student");
        System.out.println("Type 3 to delete student");
        System.out.println("Type 4 to print the students list");
        System.out.println("Type 5 to Exit");

        System.out.println("What do you want to do?");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (choice != 5) {
            switch (choice) {
                case 1:
                    System.out.println("Enter student name: ");
                    String name = scanner.next();
                    students.add(new Student(name));
                    break;
                    case 2:
                        System.out.println("Enter student name: ");
                        String searchName = scanner.next();
                        boolean found = false;
                        for (Student student : students) {
                            if(student.name.equals(searchName)){
                                found = true;
                            }
                        }
                        if(!found) {
                            System.out.println("Student not exist");
                        }else{
                            System.out.println("Student exists");
                        }
                        break;
                        case 3:
                            System.out.println("Enter student name: ");
                            String deleteName = scanner.next();
                            for (Student student : students) {
                                if(student.name.equals(deleteName)){
                                    students.remove(student);
                                }
                            }
                            break;
                            case 4:
                                for(Student student : students){
                                    System.out.println("======== List of students =======");
                                    System.out.println(student.name);
                                }
                                break;
                                case 5:
                                    break;
                                    default:
                                        System.out.println("Invalid choice");
            }
            System.out.println("What do you want to do?");
            choice = scanner.nextInt();
        }
    }
}