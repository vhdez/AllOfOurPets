public class Sibling extends Person {
    String school;

    public Sibling(String name, int age, String gender, String school, String occupation, String ethnicity) {
        super(age, name, gender, school, occupation, ethnicity);
        this.school = school;
    }

    void describeSelf() {
        System.out.println("Hello!  I'm " + name + ", I am Chris'" + gender + " , I am " + age + " years old and I attend" + school);
    }
    void wave() {
        System.out.println(name + " waves to her brother Chris");
    }
    void pet() {System.out.println(name + " pets Fifi");
    }
}
