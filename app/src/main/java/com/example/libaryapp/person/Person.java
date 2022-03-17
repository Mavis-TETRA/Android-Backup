package com.example.libaryapp.person;

public class Person {
    protected int ms;
    protected String name;
    protected String phone;

    public Person() {
    }

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Person(int ms, String name, String phone) {
        this.ms = ms;
        this.name = name;
        this.phone = phone;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
