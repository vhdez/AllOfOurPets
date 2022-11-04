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
        riley.name = "rileyp";
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

        Cat GiasCat = new Cat();
        GiasCat.size = "Chunky";
        GiasCat.color = "Black and White";
        GiasCat.fur = "Fluffy";
        GiasCat.age = 2;
        GiasCat.hasClaws = true;
        GiasCat.energy = 8;
        GiasCat.name = "Joey";
        GiasCat.describeSelf();


        Cat ChrisCat = new Cat();
        ChrisCat.size = "medium";
        ChrisCat.color = "black";
        ChrisCat.fur = "soft";
        ChrisCat.age = 14;
        ChrisCat.hasClaws = true;
        ChrisCat.energy = 7;
        ChrisCat.name = "Fifi";
        ChrisCat.describeSelf();

        Owner Chris = new Owner();
        Chris.name = "Chris";
        Chris.cat1 = ChrisCat;
        int foodAmount = 10;
        int patienceAmount = 5;

        Cat owensCat = new Cat();
        owensCat.size = "smalled";
        owensCat.color = "white";
        owensCat.fur = "soft";
        owensCat.age = 1;
        owensCat.hasClaws = false;
        owensCat.energy = 5;
        owensCat.name = "Snow";
        owensCat.describeSelf();

        Owner owen = new Owner();
        owen.name = "Owen";
        owen.cat1 = owensCat;

        Owner Gia = new Owner();
        Gia.name = "Gia Jack";
        Gia.cat1 = GiasCat;


        System.out.println();
        System.out.println("Let's introduce all of the owners:");
        // Students: construct some owners here
        owen.describeSelf();
        Chris.describeSelf();

        System.out.println();
        System.out.println("Let's see what the pets and owners will do:");
        // Pets and Owners do some action
        samsDog.bark();
        samsDog.eat();
        rileysDog.bark();
        rileysCat.kneadOn("hoodie");
        mrHsCat.purr();
        GiasCat.purr();
        GiasCat.kneadOn("Blanket");
        owensCat.purr();
        ChrisCat.purr();
        ChrisCat.kneadOn("blanket");
        ChrisCat.eat();
    }
}