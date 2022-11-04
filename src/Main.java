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
        owensMonkey.age = 2;
        owensMonkey.energy = 5;
        owensMonkey.name = "Monkey";
        owensMonkey.describeSelf();



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
        Gia.name = "Gia";
        Gia.cat1 = GiasCat;

       Owner Elijah = new Owner();
       Elijah.name = "Elijah";
       Elijah.cat1 = ElijahsCat;

        Owner Dinajda = new Owner();
        Dinajda.name = "Dinajda";
        Dinajda.foodAmount = 12;
        Dinajda.patienceAmount = 10;
        Dinajda.cat1 = dinajdasCat;

        System.out.println();
        System.out.println("Let's introduce all of the owners:");
        // Students: construct some owners here
        Owner samG = new Owner();
        owen.describeSelf();
        Chris.describeSelf();
        riley.describeSelf();
        Gia.describeSelf();
        Dinajda.describeSelf();
        samG.describeSelf();

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


        samG.panda1 = samGpanda;
        samG.cat1 = samGcat;
        samG.name = "Sam G";

        dinajdasCat.rollUpAndSleep();
        owensMonkey.bark();
        ChrisCat.kneadOn("blanket");
        ChrisCat.eat();
        ChrisFrog.croak();
        ChrisFrog.eat();
        ChrisFrog.leap();
        Chris.feed(ChrisCat);
    }
}