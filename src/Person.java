import java.util.ArrayList;

public class Person {
    ArrayList<Sibling> mySiblings;
    int age;
    String name;
    String occupation;
    String ethnicity;
    String gender;

    String height;

    public Person() {
        mySiblings = new ArrayList<>();

    }
    public Person(int age, String name, String occupation,  String ethnicity, String gender,  String height) {
        mySiblings = new ArrayList<>();
        this.occupation = occupation;
        this.age = age;
        this.ethnicity = ethnicity;
        this.name = name;
        this.gender = gender;
        this.height = height;
    }

    void describeSelf() {
        System.out.println("Hi my name is " + name + ", I am " + ethnicity + " and a " + gender + ". I am " + age + " years old. My occupation is:" + occupation + ".");
    }



}
