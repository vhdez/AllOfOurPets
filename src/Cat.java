public class Cat {
    // Fields
    String size;
    String color;
    String fur;
    int age;
    boolean hasClaws;
    int energy;
    String name;
    Owner owner;

    // Methods
    void describeSelf() {
        System.out.println("Meow!  I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " cat with " + fur + " fur.");
    }

    void clean() {
        System.out.println(name + " cleaned itself.");
    }

    void rollUpAndSleep() {
        energy = energy + 1;
        System.out.println(name + " rolled-up and slept.");
    }

    void kneadOn(String what) {
        if (owner != null) {
            System.out.println(name + " kneaded on " + owner.name + "'s " + what);
        } else {
            System.out.println(name + " kneaded on someone's " + what);
        }
    }
    void walk() {
        energy = energy - 1;
        System.out.println("Yay!, I'm going on a walk. Now " + name + "'s energy is at " + energy);
    }

    void purr() {
        System.out.println(name + " purrs hello.");
    }

    void eat() {
        energy = energy + 1;
        System.out.println("Yum, now " + name + "'s energy is at " + energy);
    }
}
