public class Panda {
        // Fields
        String size;

        String pandaAbility;

        String species;

        String height;
        String color;

        String fur;

        int age;

        int energy;

        String name;

        Owner owner;

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


