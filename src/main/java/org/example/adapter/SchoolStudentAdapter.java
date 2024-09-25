package org.example.adapter;

public class SchoolStudentAdapter implements Student{
    SchoolStudent schoolStudent;
    public SchoolStudentAdapter(SchoolStudent schoolStudent)
    {
        this.schoolStudent=schoolStudent;
    }

    @Override
    public String getName() {
        return this.schoolStudent.getFirstname();
    }

    @Override
    public String getSurName() {
        return this.schoolStudent.getLastname();
    }

    @Override
    public String getEmail() {
        return this.schoolStudent.getEmailAddress();
    }
}
