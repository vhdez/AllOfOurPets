public class Panda extends Pet {
        // Fields

        String fur;
        String pandaAbility;
        String species;
        String height;

    public Panda(String size, String color, int age, int energy, String name, Owner owner, String fur, String pandaAbility, String Species, String height) {
        super(size, color, age, energy, name, owner);
        this.fur = fur;
        this.pandaAbility = pandaAbility;
        this.species = species;
        this.height = height;
    }
        // Methods
        void describeSelf() {
            System.out.println("WOO WOO!  I'm " + name + ", a " + size + " " + height + "-sized, " + age + " year-old " + color + " " + species +" with " + fur + " fur. My favorite activity is "+pandaAbility+"!");
        }

        void eat() {
            if (owner != null && owner.foodAmount > 0) {
                energy = energy + 1;
                System.out.println("Yum, now " + name + "'s energy is at " + energy);
            } else {
                System.out.println("My owner has no food!");
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

        void climb() {
            energy = energy - 2;
            System.out.println("Climbing was awesome! Now " + name + "'s energy is at "+energy);

        }
    }


