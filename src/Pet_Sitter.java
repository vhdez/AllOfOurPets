import java.util.ArrayList;

public class Pet_Sitter extends Person{
    ArrayList<Pet> petsToSit;
    int foodAmount;
    int patienceAmount;

    public Pet_Sitter(String occupation, int age, String ethnicity, String name, String gender, String height, int foodAmount, int patienceAmount) {
        super(age, name,occupation, ethnicity, gender, height);
        this.petsToSit = new ArrayList<>();
        this.foodAmount = foodAmount;
        this.patienceAmount = patienceAmount;
    }

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
        for (Pet pet: petsToSit) {
            System.out.println("Pet Sitter " + name + " is taking care of " + pet.name);
        }
    }

}
