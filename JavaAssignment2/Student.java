package JavaAssignment2;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNo;
    private double marks;

    
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public double getMarks() {
        return marks;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }

    public void setRollNo(int rollNo) {
        if (rollNo > 0) {
            this.rollNo = rollNo;
        } else {
            System.out.println("Roll number must be positive");
        }
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks must be between 0 and 100");
        }
    }

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            Student s = new Student();
            
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            s.setName(name);
            
            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();
            s.setRollNo(rollNo);
            
            System.out.print("Enter marks: ");
            double marks = scanner.nextDouble();
            s.setMarks(marks);
            
            System.out.println("Student details:");
            System.out.println("Name: " + s.getName());
            System.out.println("Roll No: " + s.getRollNo());
            System.out.println("Marks: " + s.getMarks());
            
            scanner.close();
        }
    }


