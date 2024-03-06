/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chris;

/**
 *
 * @author Givenchy
 */
import java.util.Scanner;

public class Chris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter test case number: ");
        int caseNum = scanner.nextInt();

        switch (caseNum) {
            case 1 -> case1();
            case 2 -> case2();
            case 3 -> case3();
            case 4 -> case4();
        }
    }

    private static void case1() {
        Student student = new Student("Jemar Jude", "Maranga", 17);
        System.out.println("Test Case 1: Student under 18");
        System.out.println(student);
    }

    private static void case2() {
        Student student = new Student("Jemar Jude", "Maranga", 17);
        student.increaseAge();
        System.out.println("Test Case 2: Increase age of student1");
        System.out.println(student);
    }

    private static void case3() {
        Student student = new Student("Jose", "Cruz", 19);
        System.out.println("Test Case 3: Student over 18");
        System.out.println(student);
    }
    private static void case4() {
        Student student = new Student("Chris Paolo", "Caral", 19);
        System.out.println("Test Case 4: Student over 18");
        System.out.println(student);
    }
}


