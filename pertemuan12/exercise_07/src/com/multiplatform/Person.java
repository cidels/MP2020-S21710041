package com.multiplatform;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String setFirstName(String fname) {
        return this.firstName = fname;
    }
    public void setLastName(String lname) {
        this.lastName = lname;
    }
    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 100) {
            this.age = 0;
        } else {
            this.age = newAge;
        }
    }
    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }
    public String getFullName() {
        if (lastName.isEmpty()) {
            this.lastName = firstName;
            return this.lastName;
        }
        if (firstName.isEmpty()) {
            this.firstName = lastName;
            return this.firstName;
        }
        return firstName + " " + lastName;
    }
}

