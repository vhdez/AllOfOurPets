import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Construct all of the Owners
        ArrayList<Owner> allOwners = new ArrayList<>();
        Owner mrH = new Owner("Mr. Hernandez", 10, 5);
        allOwners.add(mrH);
        Owner mrLatimer = new Owner("Mr. Latimer", 8,2);
        allOwners.add(mrLatimer);
        Owner owen = new Owner("Owen", 10, 10);
        allOwners.add(owen);
        Owner samG = new Owner("Sam G",9, 7);
        allOwners.add(samG);
        Owner Chris = new Owner("Chris", 10, 5);
        allOwners.add(Chris);
        Owner Gia = new Owner("Gia", 17,52);
        allOwners.add(Gia);
        Owner Dinajda = new Owner("Dinajda", 12, 10);
        allOwners.add(Dinajda);
        Owner riley = new Owner("Riley", 15, 20);
        allOwners.add(riley);
        Owner Zane = new Owner("Zane", 7, 7);
        allOwners.add(Zane);
        Owner PhillyBoySam = new Owner ("Pbs", 10, 12);
        allOwners.add(PhillyBoySam);
        Owner Elijah = new Owner("Elijah", 10,4);
        allOwners.add(Elijah);

        // Construct all of the Pets
        ArrayList<Pet> allPets = new ArrayList<>();

        Dog widow = new Dog("large", "black", 2, 18, "Widow", PhillyBoySam, "coarse", "paws");
        allPets.add(widow);
        PhillyBoySam.allPetsOwned.add(widow);

        Cat garfield = new Cat("fat", "orange", 35, 2, "Garfield", mrH, "soft", false);
        allPets.add(garfield);
        mrH.allPetsOwned.add(garfield);

        Cat samGcat = new Cat("large","orange and white",4,9,"Pickles",samG, "soft",true);
        allPets.add(samGcat);
        samG.allPetsOwned.add(samGcat);

        Panda samGpanda = new Panda("small","black and white",2,2,"Kikkoman",samG,"soft","climbing","panda","short");
        allPets.add(samGpanda);
        samG.allPetsOwned.add(samGpanda);

        capybara Capy = new capybara("chunky", "brown", 2, 3, "Capy", Dinajda, "short", true);
        allPets.add(Capy);
        Dinajda.allPetsOwned.add(Capy);

        Cat Loki = new Cat("muscular", "grey tabby", 3, 7, "Loki", Dinajda, "smooth", true);
        allPets.add(Loki);
        Dinajda.allPetsOwned.add(Loki);

        allPets.add(new Pet("large","orange and white",4,9,"Pickles",samG ));

        Monkey owensMonkey = new Monkey("small", "brown", 17, 10, "Monkey", owen, "Soft", 1000, 1, "long");
        allPets.add(owensMonkey);
        owen.allPetsOwned.add(owensMonkey);

        Cat owensCat = new Cat("small", "white", 1, 10, "Snow",  owen, "Soft", false);
        allPets.add(owensCat);
        owen.allPetsOwned.add(owensCat);

        Cat Joey = new Cat("Chunky", "Black and White", 2, 10, "Joey", Gia, "Fluffy" ,false);
        allPets.add(Joey);
        Gia.allPetsOwned.add(Joey);

        //Chris' Pets/Person
        Cat Fifi = new Cat("medium","black",14, 7, "Fifi", Chris, "soft", true);
        Frog Frogston = new Frog("tiny","brown", 2, 5, "Frogton", " baritone", "smooth", Chris);
        Sibling ChrisSibling = new Sibling("Alyssa", 23, "unemployed", "Italian", "sister", "Millersville University");
        Chris.allPetsOwned.add(Fifi);
        Chris.allPetsOwned.add(Frogston);
        Chris.mySiblings.add(ChrisSibling);
        allPets.add(Fifi);
        allPets.add(Frogston);

        Parrot Polly = new Parrot ("small", "Blue, Red and Yellow", 5, 2, "Polly", Gia,"Polly want a cracker",true );
        allPets.add(Polly);
        Gia.allPetsOwned.add(Polly);

        Cat charles = new Cat("chubby", "orange", 2, 3, "Charles", riley, "soft", true);
        allPets.add(charles);
        riley.allPetsOwned.add(charles);

        Snake greenbean = new Snake("long", "green", 1, 3, "Greenbean", riley);
        allPets.add(greenbean);
        riley.allPetsOwned.add(greenbean);

        Cat Atticus = new Cat("medium","grey",2, 6, "Atticus", Elijah, "soft", true);
        allPets.add(Atticus);
        Elijah.allPetsOwned.add(Atticus);

        Fox Geranamo = new Fox("small","red",4, 8, "Geranamo", Elijah, "rough", true,"HAHAHHAHAHA");
        allPets.add(Geranamo);
        Elijah.allPetsOwned.add(Geranamo);

        Tiger bronald = new Tiger("large", "Orange/White", 2, 7, "bronald", Zane, "soft", true);
        allPets.add(bronald);
        Zane.allPetsOwned.add(bronald);

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
        System.out.println("Let's see what our PETS and OWNERS can do:");
        // get all pets to do their unique walking
        for (Pet pet: allPets) {
            pet.walk();
        }
        // get all  owners to feed their pets
        allOwners.get(0).feed();
        allOwners.get(1).feed();
        owen.feed();
        owensCat.purr();
        allOwners.get(5).feed();
        // get a cat to do cat-only method
        ((Cat)allPets.get(1)).purr();
        // get a dog to do dog-only method
        ((Dog)allPets.get(0)).bark();
        Geranamo.laughs();
        Loki.eat();
        samGpanda.eat();
        samGpanda.climb();
        samGpanda.sleep();
        Loki.eat();
        Chris.feed();
        Loki.eat();
        Capy.sleep();
        Capy.eat();
        Polly.Mimic();
        Loki.rollUpAndSleep();
        Joey.rollUpAndSleep();
        Joey.eat();
        Fifi.kneadOn("blanket");
        Frogston.croak();
        Frogston.leap();
        Chris.feed();
        Polly.talk();
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

        // All of the Persons

        MonkeySitter owenMonkeySitter = new MonkeySitter();
        owenMonkeySitter.age = 17;
        owenMonkeySitter.location = "Philly";
        owenMonkeySitter.name = "Owen";

        Pet_Sitter james = new Pet_Sitter("Pet Sitter", 26, "White", "James", "Male", "6'1", 20, 20);
        james.petsToSit.add(charles);
        james.petsToSit.add(greenbean);

        System.out.println();
        System.out.println("Let's introduce all of our PERSONS:");
        james.describeSelf();
        owenMonkeySitter.describeSelf();
        ChrisSibling.describeSelf();

        System.out.println();
        System.out.println("Let's see what our PERSONS can do:");
        james.walk(greenbean);
        owenMonkeySitter.sitMonkey();
        ChrisSibling.wave();
        ChrisSibling.pet();
    }
}