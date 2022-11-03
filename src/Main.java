public class Main {
    public static void main(String[] args) {
        System.out.println("Let's introduce all of our pets:");

        Dog samsDog = new Dog();
        samsDog.size = "large";
        samsDog.color = "black";
        samsDog.fur = "coarse";
        samsDog.age = 2;
        samsDog.energy = 1;
        samsDog.limbs = "paws";
        samsDog.name = "Widow";
        samsDog.describeSelf();

        Dog rileysDog = new Dog();
        rileysDog.size = "medium";
        rileysDog.color = "tan";
        rileysDog.fur = "short";
        rileysDog.age = 1;
        rileysDog.energy = 9;
        rileysDog.limbs = "paws";
        rileysDog.name = "Graham";
        rileysDog.describeSelf();

        Cat rileysCat = new Cat();
        rileysCat.size = "Chubby";
        rileysCat.color = "orange and white";
        rileysCat.fur = "soft";
        rileysCat.age = 2;
        rileysCat.hasClaws = true;
        rileysCat.energy = 3;
        rileysCat.name = "Charles";
        rileysCat.describeSelf();

        Owner riley = new Owner();
        riley.name = "riley";
        riley.foodAmount = 10;
        riley.patienceAmount = 20;
        riley.cat1 = rileysCat;
        rileysCat.owner = riley;

        Cat mrHsCat = new Cat();
        mrHsCat.size = "fat";
        mrHsCat.color = "orange";
        mrHsCat.fur = "soft";
        mrHsCat.age = 35;
        mrHsCat.hasClaws = false;
        mrHsCat.energy = 2;
        mrHsCat.name = "Garfield";
        mrHsCat.describeSelf();

        System.out.println();
        System.out.println("Let's introduce all of the owners:");
        // Students: construct some owners here

        System.out.println();
        System.out.println("Let's see what the pets and owners will do:");
        // Pets and Owners do some actions
        samsDog.bark();
        samsDog.eat();
        rileysDog.bark();
        rileysCat.kneadOn("hoodie");
        mrHsCat.purr();
    }
}