import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Construct all of the Owners
        ArrayList<Owner> allOwners = new ArrayList<>();
        allOwners.add(new Owner("Mr. Hernandez", 10, 5));
        allOwners.add(new Owner("Mr. Latimer", 8,2));
        Owner samG = new Owner("Sam G",9, 7);
        Owner Chris = new Owner("Chris", 10, 5);
        allOwners.add(samG);
        Owner Dinajda = new Owner("Dinajda", 12, 10);
        allOwners.add(Dinajda);

        // Construct all of the Pets
        ArrayList<Pet> allPets = new ArrayList<>();

        Owner mrLatimer = allOwners.get(1);
        Dog widow = new Dog("large", "black", 2, 1, "Widow", mrLatimer, "coarse", "paws");
        allPets.add(widow);
        mrLatimer.allPetsOwned.add(widow);

        Owner mrH = allOwners.get(0);
        Cat garfield = new Cat("fat", "orange", 35, 2, "Garfield", mrH, "soft", false);
        allPets.add(garfield);
        mrH.allPetsOwned.add(garfield);

        Dinajda = allOwners.get(2);
        capybara Capy = new capybara("chunky", "brown", 2, 3, "Capy", Dinajda, "short", true);
        allPets.add(Capy);
        Dinajda.allPetsOwned.add(Capy);

        allPets.add(new Pet("large","orange and white",4,9,"Pickles",samG ));

        System.out.println();
        System.out.println("Let's introduce all of our OWNERS:");
        for (Owner owner: allOwners) {
            owner.describeSelf();
        }
        System.out.println();
        System.out.println("Let's introduce all of our PETS:");
        for (Pet pet: allPets) {
            pet.describeSelf();
        }

        System.out.println();
        System.out.println("Let's see what our PETS and OWNERS ca do:");
        // get all pets to do their unique walking
        for (Pet pet: allPets) {
            pet.walk();
        }
        // get all  owners to feed their pets
        allOwners.get(0).feed();
        allOwners.get(1).feed();
        // get a cat to do cat-only method
        ((Cat)allPets.get(1)).purr();
        // get a dog to do dog-only method
        ((Dog)allPets.get(0)).bark();
        System.out.println();

        Dog SirajsDog = new Dog();
        SirajsDog.size = "small";
        SirajsDog.color = "grey and white";
        SirajsDog.fur = "fluffy";
        SirajsDog.age = 4;
        SirajsDog.limbs = "arms and legs";
        SirajsDog.energy = 10;
        SirajsDog.name = "Smokey";
        SirajsDog.describeSelf();


        Cat rileysCat = new Cat();
        rileysCat.size = "Chubby";
        rileysCat.color = "orange and white";
        rileysCat.fur = "soft";
        rileysCat.age = 2;
        rileysCat.hasClaws = true;
        rileysCat.energy = 3;
        rileysCat.name = "Charles";
        rileysCat.describeSelf();

        Snake rileysSnake = new Snake();
        rileysSnake.size = "Long";
        rileysSnake.color = "green";
        rileysSnake.age = 3;
        rileysSnake.energy = 1;
        rileysSnake.name = "Greenbean";
        rileysSnake.describeSelf();

        Owner riley = new Owner();
        riley.name = "riley";
        riley.foodAmount = 10;
        riley.patienceAmount = 20;
        riley.allPetsOwned.add(rileysCat);
        riley.snake1 = rileysSnake;
        rileysCat.owner = riley;

        // Gia's cat
        Cat GiasCat = new Cat();
        GiasCat.size = "Chunky";
        GiasCat.color = "Black and White";
        GiasCat.fur = "Fluffy";
        GiasCat.age = 2;
        GiasCat.hasClaws = true;
        GiasCat.energy = 10;
        GiasCat.name = "Joey";
        GiasCat.describeSelf();

//Chris' cat, frog, sibling, and owner
        Cat ChrisCat = new Cat();
        ChrisCat.size = "medium";
        ChrisCat.color = "black";
        ChrisCat.fur = "soft";
        ChrisCat.age = 14;
        ChrisCat.hasClaws = true;
        ChrisCat.energy = 7;
        ChrisCat.name = "Fifi";
        ChrisCat.describeSelf();

        Frog ChrisFrog = new Frog("tiny","brown", 2, 5, "Frogton", " baritone", "smooth", Chris);
        ChrisFrog.size = "tiny";
        ChrisFrog.color = "brown";
        ChrisFrog.texture = "smooth";
        ChrisFrog.age = 2;
        ChrisFrog.croakSound = " baritone";
        ChrisFrog.energy = 5;
        ChrisFrog.name = "Frogston";
        ChrisFrog.describeSelf();

        Sibling ChrisSibling = new Sibling();
        ChrisSibling.age = 23;
        ChrisSibling.name = "Alyssa";
        ChrisSibling.school = " Millersville University";
        ChrisSibling.gender = " sister";
        ChrisSibling.describeSelf();

        Chris.name = "Chris";
        Chris.allPetsOwned.add(ChrisCat);
        Chris.frog1 = ChrisFrog;
        Chris.sibling1 = ChrisSibling;

        Cat owensCat = new Cat();
        owensCat.size = "small";
        owensCat.color = "white";
        owensCat.fur = "soft";
        owensCat.age = 1;
        owensCat.hasClaws = false;
        owensCat.energy = 5;
        owensCat.name = "Snow";
        owensCat.describeSelf();

        Cat ElijahsCat = new Cat();
        ElijahsCat.size = "medium";
        ElijahsCat.color = "grey";
        ElijahsCat.fur = "soft";
        ElijahsCat.age = 2;
        ElijahsCat.hasClaws = true;
        ElijahsCat.energy = 6;
        ElijahsCat.name = "Atticus";
        ElijahsCat.describeSelf();

        Monkey owensMonkey = new Monkey();
        owensMonkey.size = "small";
        owensMonkey.color = "brown";
        owensMonkey.fur = "soft";
        owensMonkey.age = 2;
        owensMonkey.energy = 5;
        owensMonkey.name = "Monkey";
        owensMonkey.describeSelf();

       Fox ElijahsFox = new Fox();
        ElijahsFox.size = "small";
        ElijahsFox.color = "red";
        ElijahsFox.fur = "rough";
        ElijahsFox.age = 4;
        ElijahsFox.energy = 8;
        ElijahsFox.name = "Goku";
        ElijahsFox.describeSelf();

        Cat dinajdasCat = new Cat();
        dinajdasCat.size = "muscular";
        dinajdasCat.color = "grey tabby";
        dinajdasCat.fur = "smooth";
        dinajdasCat.age = 3;
        dinajdasCat.hasClaws = true;
        dinajdasCat.energy = 7;
        dinajdasCat.name = "Loki";
        dinajdasCat.describeSelf();

        Dog PhillyBoySamDog = new Dog();
        PhillyBoySamDog.size = "medium";
        PhillyBoySamDog.color = "black";
        PhillyBoySamDog.fur = "short";
        PhillyBoySamDog.age = 2;
        PhillyBoySamDog.energy = 9;
        PhillyBoySamDog.limbs = "paws";
        PhillyBoySamDog.name = "Widow";
        PhillyBoySamDog.describeSelf();

        Owner owen = new Owner();
        owen.name = "Owen";
        owen.allPetsOwned.add(owensCat);

        //Gia as an Owner
        Owner Gia = new Owner();
        Gia.name = "Gia";
        Gia.foodAmount = 17;
        Gia.patienceAmount = 52;
        Gia.allPetsOwned.add(GiasCat);

       Owner Elijah = new Owner();
       Elijah.name = "Elijah";
       Elijah.allPetsOwned.add(ElijahsCat);

        Owner PhillyBoySam = new Owner ();
        PhillyBoySam.name = "pbs";
        PhillyBoySam.foodAmount = 15;
        PhillyBoySam.patienceAmount = 12;
        PhillyBoySam.allPetsOwned.add(PhillyBoySamDog);

        System.out.println();
        System.out.println("Let's introduce all of the owners:");
        // Students: construct some owners here
        owen.describeSelf();
        Chris.describeSelf();
        riley.describeSelf();
        Gia.describeSelf();
        Dinajda.describeSelf();
        samG.describeSelf();

        System.out.println();
        System.out.println("Let's see what the pets and owners will do:");
        // Pets and Owners do some action
        rileysCat.kneadOn("hoodie");
        rileysSnake.rollUpAndSleep();
        rileysSnake.eat();
        rileysSnake.play();

        GiasCat.purr();
        GiasCat.kneadOn("Blanket");
        owensCat.purr();
        ChrisCat.purr();

        //Sam Work begin

        samG.foodAmount = 50;
        samG.patienceAmount = 100;
        Cat samGcat = new Cat();
        samGcat.size = "Large";
        samGcat.color = "orange and white";
        samGcat.fur = "soft";
        samGcat.age = 4;
        samGcat.hasClaws = true;
        samGcat.energy = 9;
        samGcat.name = "Pickles";
        samGcat.describeSelf();

        Panda samGpanda = new Panda();
        samGpanda.species = "panda";
        samGpanda.owner = samG;
        samGpanda.size = "small";
        samGpanda.height = "short";
        samGpanda.color = "black and white";
        samGpanda.fur = "soft";
        samGpanda.age = 2;
        samGpanda.pandaAbility = "climbing";
        samGpanda.energy = 2;
        samGpanda.name = "Kikkoman";
        samGpanda.describeSelf();
        samGpanda.eat();
        samGpanda.climb();
        samGpanda.sleep();

        //Gia's Parrot
        Parrot GiasParrot = new Parrot();
        GiasParrot.size = "small";
        GiasParrot.color = "Blue Red and Yellow";
        GiasParrot.age = 5;
        GiasParrot.energy = 2;
        GiasParrot.name = "Polly";
        GiasParrot.describeSelf();

        samG.panda1 = samGpanda;
        samG.allPetsOwned.add(samGcat);
        samG.name = "Sam G";

        dinajdasCat.rollUpAndSleep();
        GiasCat.rollUpAndSleep();
        GiasCat.eat();
        owensMonkey.bark();
        //Chris' pets' (and sibling's) actions
        ChrisCat.kneadOn("blanket");
        ChrisCat.eat();
        ChrisFrog.croak();
        ChrisFrog.eat();
        ChrisFrog.leap();
        Chris.feed(ChrisCat);
        ChrisSibling.wave();
        ChrisSibling.pet();
        GiasParrot.talk();

        System.out.println();
        System.out.println("Let's introduce all of the Pet Sitters:");
        james.describeSelf();

        System.out.println();
        System.out.println("Now the Pet Sitters are going to do their job:");
        james.walk(rileysSnake);
        Chris.feed();
        dinajdasCat.eat();
        Capy.sleep();
        Capy.eat();
    }
}