package edu.sla.allPets;

public class Tiger extends Pet {
    // Fields
    String fur;



    boolean hasClaws;

    // Constructors
    public Tiger() {
    }

    public Tiger(String size, String color, int age, int energy, String name, Owner owner, String fur, boolean hasClaws) {
        super(size, color, age, energy, name, owner);
        this.fur = fur;
        this.hasClaws = hasClaws;
    }

    // Methods
    void describeSelf() {
        System.out.println("Roar!  I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " tiger with " + fur + " fur.");
    }

    void sleep() {
        energy = energy + 2;
        System.out.println(name + " slept.");
    }

    void play() {
        energy = energy - 1;
        System.out.println(name + " played around.");
    }

    void attack(String what) {
        energy = energy - 1;
        System.out.println(name + " attacked.");

        }

    void acknowledging() {
        System.out.println(name + " roars.");
    }

    void walk() {
        System.out.println(name + " walked around.");
    }




}

