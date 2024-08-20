package asmallcollegesystem;

import java.util.Scanner;
import java.util.Arrays;

public class Student2 extends Course {

    Scanner choco = new Scanner(System.in);
    String name;
    int phonenumber;
Course[] enrolledcourses ;
    String answer = choco.next().toLowerCase();

    public void addcourse() {
        if (answer.equals("yes")) {
            System.out.println("how much course you want to enroll");
            int n = choco.nextInt();
            Course[] enrolledcourses = new Course[n];
            for (int i = 0; i < n; i++) {
            }

            addCourses(enrolledcourses);
        }
    }

    public void addCourses(Course[] coursesToAdd) {
        // Assuming you want to add all courses from 'coursesToAdd' to 'enrolledcourses'
        for (Course i : coursesToAdd) {
            enrolledcourses = Arrays.copyOf(enrolledcourses, enrolledcourses.length + 1);
            enrolledcourses[enrolledcourses.length - 1] = i;
        }
    }

}
