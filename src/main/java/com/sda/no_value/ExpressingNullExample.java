package com.sda.no_value;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ExpressingNullExample {
    public static void main (String[] args){

        System.out.println("Expressing null");

        LessonDIary javaClass = new LessonDIary(
                null,
                Collections.emptyList(),
                4
        );


        String teacherName = javaClass.getTeacher();
        if (teacherName != null){
            System.out.println(teacherName.toUpperCase());
        }
        else {
            System.out.println("No Teacher");
        }

        Optional<String> teacherName2 = javaClass.getTeacherSafeWay();
        teacherName2.ifPresent ( s -> {
            System.out.println("Got a teacher");
            System.out.println("Name is: " + s);
        });

        if (teacherName2.isPresent()) {
            System.out.println("Teacher name from optional " + teacherName2.get());
        }
        else {
            System.out.println("No teacher inside optional");
        }
    }
}




class LessonDIary{

    private String teacher;
    private List<String> students;
    private Integer numberOfStudents;

    public LessonDIary(String teacher, List<String> students, Integer numberOfStudents) {
        this.teacher = teacher;
        this.students = students;
        this.numberOfStudents = numberOfStudents;
    }
    public String getTeacher(){
        return teacher;
    }
    public List<String>getStudents(){
        return students;
    }
    public Optional<String> getTeacherSafeWay(){
        return Optional.ofNullable(teacher);
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public String toString() {
        return "LessonDIary{" +
                "teacher='" + teacher + '\'' +
                ", students=" + students +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
