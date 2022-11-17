package edu.sla.allPets;

public class Sibling extends Person {
    private String school;

    public Sibling(String name, int age, String occupation, String ethnicity, String gender, String school) {
        super(age, name, occupation, ethnicity, gender, school);
        this.setSchool(school);
    }

    void describeSelf() {
        System.out.println("Hello! I'm " + getName() + ", I am Chris' " + getGender() + ", I am " + getAge() + " years old and I attend " + getSchool());
    }
    void wave() {
        System.out.println(getName() + " waves to her brother Chris");
    }
    void pet() {System.out.println(getName() + " pets Fifi");
    }

    String getSchool() {
        return school;
    }

    void setSchool(String school) {
        this.school = school;
    }
}
