package edu.sla.allPets;

import java.util.ArrayList;

class Owner extends Person{
    // fields
    private int foodAmount;
    private int moneyAmount;
    private int patienceAmount;
    private long creditCardNumber;
    private ArrayList<Pet> allPetsOwned;
    private Sibling sibling1;

    // constructors
    public Owner(String occupation, int age, String ethnicity, String name, String gender, String height, int foodAmount, int moneyAmount, int patienceAmount, long creditCardNumber) {
        super(age, name,occupation, ethnicity, gender, height);
        this.setAllPetsOwned(new ArrayList<>());
        this.setFoodAmount(foodAmount);
        this.setMoneyAmount(moneyAmount);
        this.setPatienceAmount(patienceAmount);
        this.setCreditCardNumber(creditCardNumber);
    }

    public Owner(String name, int foodAmount, int patienceAmount) {
        super(0, name, "unknown", "unknown", "unknown", "unknown");
        this.setAllPetsOwned(new ArrayList<>());
        this.setName(name);
        this.setFoodAmount(foodAmount);
        this.setPatienceAmount(patienceAmount);
    }

    public Owner(String name, int foodAmount, int patienceAmount, long c) {
        super(0, name, "unknown", "unknown", "unknown", "unknown");
        this.setAllPetsOwned(new ArrayList<>());
        this.setName(name);
        this.setFoodAmount(foodAmount);
        this.setPatienceAmount(patienceAmount);
        this.setCreditCardNumber(creditCardNumber);
    }

    // methods
    void feed() {
        for (Pet pet: getAllPetsOwned()) {
            if (getFoodAmount() > 0) {
                setFoodAmount(getFoodAmount() - 1);
                pet.eat();
                System.out.println(getName() + " just fed " + pet.getName());
            } else {
                System.out.println(getName() + " CANNOT feed " + pet.getName());
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
        System.out.println("Owner " + getName() + " has " + getFoodAmount() + " pieces of food and " + getPatienceAmount() + " remaining patience.");
        for (Pet pet: getAllPetsOwned()) {
            System.out.println("Owner " + getName() + " owns " + pet.getName());
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public int getPatienceAmount() {
        return patienceAmount;
    }

    public void setPatienceAmount(int patienceAmount) {
        this.patienceAmount = patienceAmount;
    }

    public long getCreditCardNumber() {
        System.out.println("ALERT.  Someone is getting " + getName() + "'s credit card!");
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        System.out.println("ALERT.  Someone is changing " + getName() + "'s credit card!");
        this.creditCardNumber = creditCardNumber;
    }

    public ArrayList<Pet> getAllPetsOwned() {
        return allPetsOwned;
    }

    public void setAllPetsOwned(ArrayList<Pet> allPetsOwned) {
        this.allPetsOwned = allPetsOwned;
    }

    public Sibling getSibling1() {
        return sibling1;
    }

    public void setSibling1(Sibling sibling1) {
        this.sibling1 = sibling1;
    }
}
