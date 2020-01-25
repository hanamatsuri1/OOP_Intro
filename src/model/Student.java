package model;

import java.util.*;

public class Student {

     int id;
     String name;
     HashMap<Integer, Double> grades;
     List<Course> enrolledCourses;

    public Student(int aid, String aname){  //Construct a Student object
        id=aid;
        name=aname;
        grades= new HashMap<>();  //Initialize the grades HashMap
        enrolledCourses= new ArrayList<>();  //Initialize the enrolledCourses list as ArrayList
    }

    public void displayCourses(){  //Display the enrolled courses of the student
        System.out.println("These are the enrolled courses：");
        for (Course x : enrolledCourses ) {
            System.out.println(x.getName()+ ", id: "+ x.getId() + ", code: " +x.getCode() +
                            ", description: "+ x.getDescription()+", credit:"+x.getCredit());
        }
    }

    public double calculateGPA(){  //Return the GPA of the student

        double totalgrades=0;  //Create totalgrades

        int totalcredits = 0;  //Create totalcredits

        for (Course course : enrolledCourses){  //Use enhance for loop to calculate total scores and total credits
            double scorecredit = (course.getCredit() * grades.get(course.getId()));
             totalgrades += scorecredit ;
            totalcredits += course.getCredit();
        }

        return totalgrades/totalcredits;

    }

    public void enrollCourse(Course course){ //Add the course to the enrolled courses list
        enrolledCourses.add(course);
    }

    public boolean setGrade(Course course, double grade){ //Set the grade of the given course
        if (enrolledCourses.contains(course)){  //Check if the course is enrolled
            grades.put(course.getId(),grade);  //Add the id of this course and the grade to the grades
            return true;
        }
        return false;
    }

    public List<Course> getEnrolledCourses(){  //Return this enrolledCourses list
        return enrolledCourses;
    }

    public static void main(String[] args) {

        //Create a few course objects
        Course CS121=new Course(1,123,"CS121", "Data Structure", 4);
        Course CS222=new Course(2,456,"CS222","Advanced Programming",3);
        Course CS230=new Course(3,789,"CS230","Computer Org and Arch",3);

        //Create a student object
        Student Jack=new Student(123,"Jack");

        //Add these courses to the student via enrollCourse
        Jack.enrollCourse(CS121);
        Jack.enrollCourse(CS222);
        Jack.enrollCourse(CS230);

        //Print the course information via displayCourses method of the student
        Jack.displayCourses();

    }

}
