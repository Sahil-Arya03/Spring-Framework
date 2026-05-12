package org.framework.Springcore;

public class Student {
    private int Studentid;
    private String StudentName;
    private String Address;

    public Student(int studentid, String studentName, String address) {
        super();
        this.Studentid = studentid;
        this.StudentName = studentName;
        this.Address = address;
    }

    public Student() {
        super();
    }

    public int getStudentid() {
        return Studentid;
    }

    public void setStudentid(int studentid) {
        Studentid = studentid;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    @Override
    public String toString() {
        return "Student{" + "id=" + Studentid + ", name='" + StudentName + '\'' + ", address='" + Address + '\'' + '}';
    }
}



