package edu.sla.allPets;

import java.util.ArrayList;

public class Person {
    private ArrayList<Sibling> mySiblings;
    private int age;
    private String name;
    private String occupation;
    private String ethnicity;
    private String gender;

    private String height;

    public Person(int age, String name, String occupation,  String ethnicity, String gender,  String height) {
        setMySiblings(new ArrayList<>());
        this.setOccupation(occupation);
        this.setAge(age);
        this.setEthnicity(ethnicity);
        this.setName(name);
        this.setGender(gender);
        this.setHeight(height);
    }

    void describeSelf() {
        System.out.println("Hi my name is " + getName() + ", I am " + getEthnicity() + " and a " + getGender() + ". I am " + getAge() + " years old. My occupation is:" + getOccupation() + ".");
    }


    ArrayList<Sibling> getMySiblings() {
        return mySiblings;
    }

    void setMySiblings(ArrayList<Sibling> mySiblings) {
        this.mySiblings = mySiblings;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getOccupation() {
        return occupation;
    }

    void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    String getEthnicity() {
        return ethnicity;
    }

    void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    String getHeight() {
        return height;
    }

    void setHeight(String height) {
        this.height = height;
    }
}
