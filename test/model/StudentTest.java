package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void enrollCourse() {  //Test enrollCourse
        Course cs224=new Course(5,5,"cs224","Des and Analy of Algorithms",3);
        Student Karin=new Student(456,"Karin");
        Karin.enrollCourse(cs224);
        assertEquals(1 , Karin.getEnrolledCourses().size());
    }

    @Test
    void setGradeFirst() {  //First test for setGrade
        Course cs239=new Course(6,6,"cs239","Social and Professional Issues",3);  //Create a course
        Student Linda=new Student(789,"Linda");  //Create a student
        Linda.enrollCourse(cs239);  //Add the course to the student via enrollCourse
        Linda.setGrade(cs239,90);  //Try setting the grade via setGrade
        assertEquals(true, Linda.setGrade(cs239,90) );  //Assert the return of setGrade to true, because the course is already enrolled
    }

    @Test
    void setGradeSecond() {  //Second test for setGrade
        Course cs249=new Course(7,7,"cs249","Social and Professional Issues",3);  //Create a course
        Student Linda=new Student(456,"Linda");  //Create a student
        Linda.setGrade(cs249,90);  //Try setting the grade via setGrade
        assertEquals(false, Linda.setGrade(cs249,90) );  //Assert the return of setGrade to false, because the course is NOT enrolled
    }

    @Test
    void calculateGPA() {
        //Create a few courses
        Course cs121=new Course(1,123,"cs121", "Data Structure", 4);
        Course cs222=new Course(2,456,"cs222","Advanced Programming",3);
        Course cs230=new Course(3,789,"cs230","Computer Org and Arch",3);

        //Create a student
        Student Jack=new Student(123,"Jack");

        //Add these courses to the student via enroll
        Jack.enrollCourse(cs121);
        Jack.enrollCourse(cs222);
        Jack.enrollCourse(cs230);

        //Set grades for each course in the student via setGrade.
        Jack.setGrade(cs121,90);
        Jack.setGrade(cs222,100);
        Jack.setGrade(cs230,80);

        assertEquals(90 , Jack.calculateGPA());

    }


}