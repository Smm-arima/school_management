package modle;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private long studentId;
    private String nationalCode;
    private String firstName;
    private String lastName;
    private Date dob;
    private double gpu;

    public Student() {
    }

    public Student(long studentId, String nationalCode, String firstName, String lastName, Date dob, double gpu) {
        this.studentId = studentId;
        this.nationalCode = nationalCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gpu = gpu;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public double getGpu() {
        return gpu;
    }

    public void setGpu(double gpu) {
        this.gpu = gpu;
    }





    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", nationalCode='" + nationalCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", gpu=" + gpu +
                '}';
    }
}
