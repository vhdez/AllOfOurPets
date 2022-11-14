import java.util.ArrayList;

public class Owner extends Person{
    // fields
    int foodAmount;
    int moneyAmount;
    int patienceAmount;
    ArrayList<Pet> allPetsOwned;
    Sibling sibling1;

    // constructors
    public Owner(String occupation, int age, String ethnicity, String name, String gender, String height, int foodAmount, int moneyAmount, int patienceAmount) {
        super(age, name,occupation, ethnicity, gender, height);
        this.allPetsOwned = new ArrayList<>();
        this.foodAmount = foodAmount;
        this.moneyAmount = moneyAmount;
        this.patienceAmount = patienceAmount;
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

    void ownerDescribeSelf() {
        System.out.println("Owner " + name + " has " + foodAmount + " pieces of food and " + patienceAmount + " remaining patience.");
        for (Pet pet: allPetsOwned) {
            System.out.println("Owner " + name + " owns " + pet.name);
        }
    }
}
