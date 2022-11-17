package edu.sla.allPets;

public class Sibling extends Person {
    String school;

    public Sibling(String name, int age, String occupation, String ethnicity, String gender, String school) {
        super(age, name, occupation, ethnicity, gender, school);
        this.school = school;
    }

    void describeSelf() {
        System.out.println("Hello! I'm " + name + ", I am Chris' " + gender + ", I am " + age + " years old and I attend " + school);
    }
    void wave() {
        System.out.println(name + " waves to her brother Chris");
    }
    void pet() {System.out.println(name + " pets Fifi");
    }
}
