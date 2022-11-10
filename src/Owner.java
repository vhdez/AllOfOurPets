import java.util.ArrayList;

public class Owner extends Person{
    // fields
    String name;
    Dog dog1;
    Dog dog2;
    Cat cat1;
    Cat cat2;
    Snake snake1;
    Frog frog1;
    Sibling sibling1;
    int foodAmount;

    int moneyAmount;
    int patienceAmount;
    ArrayList<Pet> allPetsOwned;

    Panda panda1;


    // constructors
    public Owner() {
        this.allPetsOwned = new ArrayList<>();
    }

    public Owner(String name, int foodAmount, int patienceAmount) {
        this.allPetsOwned = new ArrayList<>();
        this.name = name;
        this.foodAmount = foodAmount;
        this.patienceAmount = patienceAmount;
    }

    // methods
    void feed() {
        for (Pet pet: allPetsOwned) {
            if (foodAmount > 0) {
                foodAmount = foodAmount - 1;
                pet.eat();
                System.out.println(name + " just fed " + pet.name);
            } else {
                System.out.println(name + " CANNOT feed " + pet.name);
            }
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
        for (Pet pet: allPetsOwned) {
            System.out.println("Owner " + name + " owns " + pet.name);
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
