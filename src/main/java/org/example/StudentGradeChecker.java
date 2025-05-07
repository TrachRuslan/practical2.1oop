package com.example;

import java.util.function.Predicate;

public class StudentGradeChecker {
    public static void main(String[] args) {
        Predicate<Integer> gradePredicate = grade -> grade >= 60;

        int[] grades = {75, 50, 85, 60};
        for(int grade : grades) {
            if (gradePredicate.test(grade)) {
                System.out.println("Зараховано: " + grade);
            } else {
                System.out.println("Не зараховано: " + grade);
            }
        }
    }
}