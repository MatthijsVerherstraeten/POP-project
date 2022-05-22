package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //costructor: user enter student name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Eerste jaar\n2 - Tweede jaar\n3 - Derde Jaar\n4 - Vierde jaar\n5 - Vijfde jaar\n " +
                "Enter student class level: ");
        this.gradeYear = in.nextLine();
        System.out.print(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    //generate an ID
    private void setStudentID() {
        //grade lvl + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //enroll in courses
    public void enroll() {
        // get inside a loop, user hits 0
        System.out.println("\nEnter course to enroll (0 to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if (!course.equals("Q")) {
            courses = courses + "\n" + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        } else {
            System.out.println("BREAK!");
        }
        while (1 != 0) ;
        System.out.println("ERNOLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }
    //view balance

    //pay tuition

    //show status

}
