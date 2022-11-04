public class Frog {
    String size;
    String color;
    String texture;
    String croakSound;
    int age;
    int fullness;
    String name;
    Owner owner;

    void describeSelf() {
        System.out.println("Ribbit!  I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " frog with a" + croakSound + " croak.");
    }
    void eat() {
        fullness = fullness + 1;
        System.out.println("Yum, now " + name + "'s fullness is at " + fullness );
    }
    void croak() {
        System.out.println(name + " crooooooaks a hello.");
    }

    void leap(){System.out.println(name + " leaps over Fifi.");}

}
