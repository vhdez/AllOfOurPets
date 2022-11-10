import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Construct all of the Owners
        ArrayList<Owner> allOwners = new ArrayList<>();
        allOwners.add(new Owner("Mr. Hernandez", 10, 5));
        allOwners.add(new Owner("Mr. Latimer", 8,2));
        Owner owen = new Owner("Owen", 10, 10);
        allOwners.add(owen);
        Owner samG = new Owner("Sam G",9, 7);
        Owner Chris = new Owner("Chris", 10, 5);
        allOwners.add(samG);
        allOwners.add(new Owner("Gia", 17,52));
        Owner Dinajda = new Owner("Dinajda", 12, 10);
        allOwners.add(Dinajda);
        allOwners.add(new Owner("Gia", 8,2));
        allOwners.add(Chris);

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

        Cat samGcat = new Cat("large","orange and white",4,9,"Pickles",samG, "soft",true);
        allPets.add(samGcat);
        samG.allPetsOwned.add(samGcat);

        Panda samGpanda = new Panda("small","black and white",2,2,"Kikkoman",samG,"soft","climbing","panda","short");
        allPets.add(samGpanda);
        samG.allPetsOwned.add(samGpanda);

        Dinajda = allOwners.get(2);
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


        Owner Gia = allOwners.get (3);
        Cat Joey = new Cat("Chunky", "Black and White", 2, 10, "Joey", Gia, "Fluffy" ,false);
        allPets.add(Joey);
        Gia.allPetsOwned.add(Joey);

        Cat Fifi = new Cat("medium","black",14, 7, "Fifi", Chris, "soft", true);
        Frog Frogston = new Frog("tiny","brown", 2, 5, "Frogton", " baritone", "smooth", Chris);
        Chris.allPetsOwned.add(Fifi);
        Chris.allPetsOwned.add(Frogston);

        Parrot Polly = new Parrot ("small", "Blue, Red and Yellow", 5, 2, "Polly", Gia,"Polly want a cracker",true );
        allPets.add(Polly);
        Gia.allPetsOwned.add(Polly);

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

        Sibling ChrisSibling = new Sibling();
        ChrisSibling.age = 23;
        ChrisSibling.name = "Alyssa";
        ChrisSibling.school = " Millersville University";
        ChrisSibling.gender = " sister";
        ChrisSibling.describeSelf();

        Chris.name = "Chris";
        Chris.allPetsOwned.add(Fifi);
        Chris.frog1 = Frogston;
        Chris.sibling1 = ChrisSibling;

        Cat ElijahsCat = new Cat();
        ElijahsCat.size = "medium";
        ElijahsCat.color = "grey";
        ElijahsCat.fur = "soft";
        ElijahsCat.age = 2;
        ElijahsCat.hasClaws = true;
        ElijahsCat.energy = 6;
        ElijahsCat.name = "Atticus";
        ElijahsCat.describeSelf();

       Fox ElijahsFox = new Fox();
        ElijahsFox.size = "small";
        ElijahsFox.color = "red";
        ElijahsFox.fur = "rough";
        ElijahsFox.age = 4;
        ElijahsFox.energy = 8;
        ElijahsFox.name = "Goku";
        ElijahsFox.describeSelf();


        Dog PhillyBoySamDog = new Dog();
        PhillyBoySamDog.size = "medium";
        PhillyBoySamDog.color = "black";
        PhillyBoySamDog.fur = "short";
        PhillyBoySamDog.age = 2;
        PhillyBoySamDog.energy = 9;
        PhillyBoySamDog.limbs = "paws";
        PhillyBoySamDog.name = "Widow";
        PhillyBoySamDog.describeSelf();

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
        Chris.describeSelf();
        riley.describeSelf();
        Gia.describeSelf();
        Dinajda.describeSelf();

        System.out.println();
        System.out.println("Let's see what the pets and owners will do:");
        // Pets and Owners do some action
        rileysCat.kneadOn("hoodie");
        rileysSnake.rollUpAndSleep();
        rileysSnake.eat();
        rileysSnake.play();

        Joey.purr();
        Joey.kneadOn("Blanket");
        Fifi.purr();

        //Sam Work begin


        Parrot GiasParrot = new Parrot();
        GiasParrot.size = "small";
        GiasParrot.color = "Blue Red and Yellow";
        GiasParrot.age = 5;
        GiasParrot.energy = 2;
        GiasParrot.name = "Polly";
        GiasParrot.describeSelf();



        Loki.rollUpAndSleep();
        Joey.rollUpAndSleep();
        Joey.eat();
        //Chris' pets' (and sibling's) actions
        Fifi.kneadOn("blanket");
        Fifi.eat();
        Frogston.croak();
        Frogston.eat();
        Frogston.leap();
        Chris.feed();
        GiasParrot.talk();

        System.out.println(" ");
        System.out.println("Let's introduce all of our Petsitters:");
        MonkeySitter owenMonkeySitter = new MonkeySitter();
        owenMonkeySitter.age = 17;
        owenMonkeySitter.location = "Philly";
        owenMonkeySitter.name = "Owen";
        owenMonkeySitter.sitMonkey();

        ChrisSibling.wave();
        ChrisSibling.pet();
        GiasParrot.talk();

        Pet_Sitter james = new Pet_Sitter();
        james.name = "James";
        james.foodAmount = 20;
        james.patienceAmount = 20;
        james.cat1 = rileysCat;
        james.snake1 = rileysSnake;

        System.out.println();
        System.out.println("Let's introduce all of the Pet Sitters:");
        james.describeSelf();

        System.out.println();
        System.out.println("Now the Pet Sitters are going to do their job:");
        james.walk(rileysSnake);
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
    }
}