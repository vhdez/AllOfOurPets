public class Cat extends Pet {
    // Fields
    String fur;
    boolean hasClaws;

    // Constructors
    public Cat() {
    }

    public Cat(String size, String color, int age, int energy, String name, Owner owner, String fur, boolean hasClaws) {
        super(size, color, age, energy, name, owner);
        this.fur = fur;
        this.hasClaws = hasClaws;
    }

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
        System.out.println("No way! " + name + " won't be walked.");
    }

    void purr() {
        System.out.println(name + " purrs hello.");
    }

}
