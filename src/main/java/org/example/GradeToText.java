package com.example;

import java.util.function.Function;

public class GradeToText {
    public static void main(String[] args) {
        Function<Integer, String> gradeToText = grade -> {
            if (grade >= 90) return "Відмінно";
            if (grade >= 75) return "Добре";
            if (grade >= 60) return "Задовільно";
            return "Незадовільно";
        };

        int[] grades = {95, 70, 85, 55};
        for (int grade : grades) {
            System.out.println("Оцінка " + grade + ": " + gradeToText.apply(grade));
        }
    }
}