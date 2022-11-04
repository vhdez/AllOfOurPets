public class Monkey {
    // Fields
    String size;

    String color;

    String fur;

    int age;

    int energy;

    String limbs;

    String name;

    Owner owner;

    // Methods
    void describeSelf() {
        System.out.println("WOO WOO!  I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " dog with " + fur + " fur.");
    }

    void bark() {
        System.out.println(name + " says: Woof!");
        if (owner != null) {
            owner.patienceAmount = owner.patienceAmount - 1;
        }
    }
    void eat() {
        if (owner != null && owner.foodAmount > 0) {
            energy = energy + 1;
            System.out.println("Yum, now " + name + "'s energy is at " + energy);
        } else {
            System.out.println("WOO WOO I don't have an owner to feed me!");
        }
    }

    void sleep() {
        energy = energy + 1;
        System.out.println("Yum, now " + name + "'s energy is at " + energy);
    }

    void play() {
        energy = energy - 1;
        System.out.println("Fun!, now " + name + "'s energy is at " + energy);
    }
}