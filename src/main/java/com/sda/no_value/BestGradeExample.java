package com.sda.no_value;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
public class BestGradeExample {

    public static void main(String[] args){
        List<StudentWithGrade> studentWithGrades = new ArrayList<>();
        studentWithGrades.add(new StudentWithGrade("Maria", "W", null));
        studentWithGrades.add(new StudentWithGrade("Michael", "B", null));
        studentWithGrades.add(new StudentWithGrade("Jan", "Kowalski", 5));
        studentWithGrades.add(new StudentWithGrade("John", "Kowalski", null));
        studentWithGrades.add(new StudentWithGrade("Danuta", "Kowalski", 4));
        studentWithGrades.add(new StudentWithGrade("Erik", "Kowalski", 3));

        StudentWithGrade bestStudent = studentWithGrades.getFirst();
        for (StudentWithGrade student : studentWithGrades) {
            Integer grade = student.finalGrade();
            if (grade != null && bestStudent.finalGrade() != null && grade > bestStudent.finalGrade() ) {
                bestStudent = student;

                if (grade == 5){
                    break;
                }
            }
        }

        if (bestStudent.finalGrade() != null) {
            System.out.println("Our best student: " + bestStudent);
        } else {
            System.out.println("Too early!");
        }
        //with loops
        //of is factory method
        //noinspection ComparatorMethodParameterNotUsed
        Stream.of(
                new StudentWithGrade("Maria", "M", null),
                new StudentWithGrade("Michael", "B", 1),
                new StudentWithGrade("Jan", "Kowalski", 2)
        )
                .filter(student -> student.finalGrade() != null)
                .max((student1, student2) -> student2.finalGrade().compareTo(student2.finalGrade()))
                .ifPresentOrElse(student -> System.out.println("Best student: " + student),
                   () -> System.out.println("Wait for final grades"));

        System.out.println("More stream examples");
        studentWithGrades.stream()
                .filter(student -> student.finalGrade() != null)
  //              .sorted((o1, o2) -> o2.finalGrade().compareTo((o1.finalGrade())))
  //              .sorted((o1, o2) -> o1.finalGrade().compareTo((o2.finalGrade())))
                .sorted(Comparator.comparing(StudentWithGrade::finalGrade).reversed())
                .toList()
                .forEach(student -> System.out.println("Student: " + student));
    }
}
