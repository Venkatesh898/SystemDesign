package org.example.adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudentList()
    {
       List<Student>students=new ArrayList<>();
       CollegeStudent collegeStudent=new CollegeStudent("Venky","Poluri","venky@gmail.com");
       SchoolStudent schoolStudent=new SchoolStudent("Ram","Mohan","ram@gmail.com");
       students.add(collegeStudent);
       students.add(new SchoolStudentAdapter(schoolStudent));
       return students;
    }
}
