public class Snake {
    String size;
    String color;
    String name;
    int age;
    int energy;
    Owner owner;


    void describeSelf() {
        System.out.println("Sssssss I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " snake.");
    }

    void rollUpAndSleep() {
        energy = energy + 1;
        System.out.println(name + " rolled-up and slept.");
    }

    void eat() {
        energy = energy + 1;
        System.out.println("Yum, now " + name + "'s energy is at  " + energy);
    }

    void play() {
        energy = energy - 1;
        System.out.println(name + " is going to go hide. go find them." + name + "'s energy is now at" + energy);

    }
}
