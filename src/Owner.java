public class Owner {
    String name;
    Dog dog1;
    Dog dog2;
    Cat cat1;
    Cat cat2;
    Snake snake1;

    Panda panda1;
    Frog frog1;
    int foodAmount;

    int moneyAmount;
    int patienceAmount;

    void feed(Dog dog) {
        if (foodAmount > 0) {
            foodAmount = foodAmount - 1;
            dog.eat();
            System.out.println(name + " just fed " + dog.name);
        } else {
            System.out.println(name + " CANNOT feed " + dog.name);
        }
    }

    void feed(Cat cat) {
        if (foodAmount > 0) {
            foodAmount = foodAmount - 1;
            cat.eat();
            System.out.println(name + " just fed " + cat.name);
        } else {
            System.out.println(name + " CANNOT feed " + cat.name);
        }
    }

    void playWith(Dog dog) {
        dog.play();
    }

    void playWith(Cat cat) {
        cat.kneadOn("lap");
        //System.out.println(name + "kneads on" + cat.owner + what);
    }

    void describeSelf() {
        System.out.println("Owner " + name + " has " + foodAmount + " pieces of food and " + patienceAmount + " remaining patience.");
        if (dog1 != null ) {
            System.out.println("Owner " + name + " owns " + dog1.name);
        }
        if (dog2 != null ) {
            System.out.println("Owner " + name + " owns " + dog2.name);
        }
        if (cat1 != null ) {
            System.out.println("Owner " + name + " owns " + cat1.name);
        }
        if (cat2 != null ) {
            System.out.println("Owner " + name + " owns " + cat2.name);
        }
        if (snake1 != null ) {
            System.out.println("Owner " + name + " owns " + snake1.name);
        }
        if (frog1 != null ) {
            System.out.println("Owner " + name + " owns " + frog1.name);
        }
        if (panda1 != null ) {
            System.out.println("Owner " + name + " owns " + panda1.name);
        }
    }
}
