package com.example.libaryapp.person;

public class Student extends Person{
    private String myClass;
    private String birth;
    private String majors;
    private String course;
    private String address;

    public Student(String name, String phone, String myClass, String birth, String majors, String course, String address) {
        super(name, phone);
        this.myClass = myClass;
        this.birth = birth;
        this.majors = majors;
        this.course = course;
        this.address = address;
    }

    public Student(String myClass, String birth, String majors, String course, String address) {
        this.myClass = myClass;
        this.birth = birth;
        this.majors = majors;
        this.course = course;
        this.address = address;
    }

    public Student(int ms, String name, String phone, String myClass, String birth, String majors, String course, String address) {
        super(ms, name, phone);
        this.myClass = myClass;
        this.birth = birth;
        this.majors = majors;
        this.course = course;
        this.address = address;
    }

    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
