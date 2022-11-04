public class Pet_Sitter {
    String name;
    Dog dog1;
    Dog dog2;
    Cat cat1;
    Cat cat2;
    Snake snake1;
    int foodAmount;
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

    void feed(Snake snake) {
        if (foodAmount > 0) {
            foodAmount = foodAmount - 1;
            snake.eat();
            System.out.println(name + " just fed " + snake.name);
        } else {
            System.out.println(name + " CANNOT feed " + snake.name);
        }
    }

    void playWith(Snake snake) {
        snake.play();
    }

    void playWith(Dog dog) {
        dog.play();
    }

    void playWith(Cat cat) {
        cat.kneadOn("lap");
    }

    void walk(Dog dog) {
        dog.walk();
    }

    void walk(Snake snake) {
        snake.walk();
    }
    void describeSelf() {
        System.out.println("Pet Sitter " + name + " has " + foodAmount + " pieces of food and " + patienceAmount + " remaining patience.");
        if (dog1 != null ) {
            System.out.println("Pet Sitter " + name + " is taking care of  " + dog1.name);
        }
        if (dog2 != null ) {
            System.out.println("Pet Sitter " + name + " is taking care of  " + dog2.name);
        }
        if (cat1 != null ) {
            System.out.println("Pet Sitter " + name + " is taking care of  " + cat1.name);
        }
        if (cat2 != null ) {
            System.out.println("Pet Sitter " + name + " is taking care of  " + cat2.name);
        }
        if (snake1 != null ) {
            System.out.println("Pet Sitter " + name + " is taking care of  " + snake1.name);
        }
    }

}
