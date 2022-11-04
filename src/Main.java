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

        Dog SirajsDog = new Dog();
        SirajsDog.size = "small";
        SirajsDog.color = "brown";
        SirajsDog.fur = "fluffy";
        SirajsDog.age = 7;
        SirajsDog.energy = 70;
        SirajsDog.limbs = "legs";
        SirajsDog.name = "Smokey";
        SirajsDog.describeSelf();



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
        riley.cat1 = rileysCat;
        riley.snake1 = rileysSnake;
        rileysCat.owner = riley;

        Pet_Sitter james = new Pet_Sitter();
        james.name = "James";
        james.foodAmount = 20;
        james.patienceAmount = 20;
        james.cat1 = rileysCat;
        james.snake1 = rileysSnake;

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
        GiasCat.energy = 10;
        GiasCat.name = "Joey";
        GiasCat.describeSelf();

//Chris' cat, frog, and owner
        Cat ChrisCat = new Cat();
        ChrisCat.size = "medium";
        ChrisCat.color = "black";
        ChrisCat.fur = "soft";
        ChrisCat.age = 14;
        ChrisCat.hasClaws = true;
        ChrisCat.energy = 7;
        ChrisCat.name = "Fifi";
        ChrisCat.describeSelf();

        Frog ChrisFrog = new Frog();
        ChrisFrog.size = "tiny";
        ChrisFrog.color = "brown";
        ChrisFrog.texture = "smooth";
        ChrisFrog.age = 2;
        ChrisFrog.croakSound = " baritone";
        ChrisFrog.fullness = 5;
        ChrisFrog.name = "Frogston";
        ChrisFrog.describeSelf();

        Owner Chris = new Owner();
        Chris.name = "Chris";
        Chris.cat1 = ChrisCat;
        Chris.frog1 = ChrisFrog;

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
        owensMonkey.benchWeight = 1000;
        owensMonkey.tail = "long";
        owensMonkey.bodyFat = 1;
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

        Owner owen = new Owner();
        owen.name = "Owen";
        owen.cat1 = owensCat;

        Owner Gia = new Owner();
        Gia.name = "Gia Jack";
        Gia.name = "Gia";
        Gia.foodAmount = 17;
        Gia.patienceAmount = 52;
        Gia.cat1 = GiasCat;

       Owner Elijah = new Owner();
       Elijah.name = "Elijah";
       Elijah.foodAmount = 20;
       Elijah.patienceAmount = 13;
       Elijah.cat1 = ElijahsCat;

        Owner Dinajda = new Owner();
        Dinajda.name = "Dinajda";
        Dinajda.foodAmount = 12;
        Dinajda.patienceAmount = 10;
        Dinajda.cat1 = dinajdasCat;

        System.out.println();
        System.out.println("Let's introduce all of the owners:");
        // Students: construct some owners here
        owen.describeSelf();
        Chris.describeSelf();
        riley.describeSelf();
        Gia.describeSelf();
        Dinajda.describeSelf();

        System.out.println();
        System.out.println("Let's see what the pets and owners will do:");
        // Pets and Owners do some action
        samsDog.bark();
        samsDog.eat();
        rileysDog.bark();
        rileysCat.kneadOn("hoodie");
        rileysSnake.rollUpAndSleep();
        rileysSnake.eat();
        rileysSnake.play();

        mrHsCat.purr();
        GiasCat.purr();
        GiasCat.kneadOn("Blanket");
        owensCat.purr();
        SirajsDog.bark();
        ChrisCat.purr();

        //Sam Work begin
        Owner samG = new Owner();
        samG.name = "Sam G";
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
        samGpanda.size = "small";
        samGpanda.height = "short";
        samGpanda.color = "black and white";
        samGpanda.fur = "soft";
        samGpanda.age = 2;
        samGpanda.energy = 2;
        samGpanda.name = "Kikkoman";
        samGpanda.describeSelf();


        dinajdasCat.rollUpAndSleep();

        System.out.println();
        System.out.println("Let's introduce all of the Pet Sitters:");
        james.describeSelf();

        System.out.println();
        System.out.println("Now the Pet Sitters are going to do their job:");
        james.walk(rileysSnake);
    }
}