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
        System.out.println(name + " kneaded on " + owner.name +"'s " + what);
    }

    void purr() {
        System.out.println(name + " purrs hello.");
    }

    void eat() {
        energy = energy + 1;
        System.out.println("Yum, now " + name + "'s energy is at " + energy);
    }
}
