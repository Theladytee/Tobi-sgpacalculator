/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tobigpacalculator;
import models.Course;
import models.Gradeunit;

/**
 *
 * @author USER
 */

    import java.util.Scanner;

public class Tobigpacalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_COURSES = 5;

        Course[] courses = new Course[NUM_COURSES];

        for (int i = 0; i < NUM_COURSES; i++) {
            System.out.println("Enter details for Course " + (i + 1) + ":");
            System.out.print("Course & Code: ");
            String courseCode = scanner.nextLine();
            System.out.print("Course Unit: ");
            int courseUnit = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Score (0-100): ");
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            String grade = Gradeunit.getGrade(score);

            courses[i] = new Course(courseCode, courseUnit, grade);
        }

        double totalQualityPoints = 0;
        int totalGradeUnits = 0;

        for (Course course : courses) {
            int gradeUnit = Gradeunit.getGradeUnit(course.getGrade());
            totalQualityPoints += gradeUnit * course.getCourseUnit();
            totalGradeUnits += course.getCourseUnit();
        }

        double gpa = totalQualityPoints / totalGradeUnits;

        System.out.println("|----------------------------|-----------------------|------------|---------------------|");
        System.out.println("| COURSE & CODE              | COURSE UNIT           | GRADE      | GRADE-UNIT          |");
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");

        for (Course course : courses) {
            System.out.printf("| %-26s | %-21d | %-10s | %-19d |\n", course.getCourseCode(), course.getCourseUnit(),
                    course.getGrade(), Gradeunit.getGradeUnit(course.getGrade()));
        }

        System.out.println("|---------------------------------------------------------------------------------------|");
        System.out.printf("\nYour GPA is = %.2f to 2 decimal places.\n", gpa);
    }
}

    

