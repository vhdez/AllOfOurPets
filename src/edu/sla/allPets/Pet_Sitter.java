package edu.sla.allPets;

import java.util.ArrayList;

public class Pet_Sitter extends Person{
    private ArrayList<Pet> petsToSit;
    private int foodAmount;
    private int patienceAmount;

    public Pet_Sitter(String occupation, int age, String ethnicity, String name, String gender, String height, int foodAmount, int patienceAmount) {
        super(age, name,occupation, ethnicity, gender, height);
        this.setPetsToSit(new ArrayList<>());
        this.setFoodAmount(foodAmount);
        this.setPatienceAmount(patienceAmount);
    }

    void feed(Dog dog) {
        if (getFoodAmount() > 0) {
            setFoodAmount(getFoodAmount() - 1);
            dog.eat();
            System.out.println(getName() + " just fed " + dog.getName());
        } else {
            System.out.println(getName() + " CANNOT feed " + dog.getName());
        }
    }

    void feed(Cat cat) {
        if (getFoodAmount() > 0) {
            setFoodAmount(getFoodAmount() - 1);
            cat.eat();
            System.out.println(getName() + " just fed " + cat.getName());
        } else {
            System.out.println(getName() + " CANNOT feed " + cat.getName());
        }
    }

    void feed(Snake snake) {
        if (getFoodAmount() > 0) {
            setFoodAmount(getFoodAmount() - 1);
            snake.eat();
            System.out.println(getName() + " just fed " + snake.getName());
        } else {
            System.out.println(getName() + " CANNOT feed " + snake.getName());
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

    void getPaidBy(Owner owner) {
        System.out.println("Pet sitter" + getName() + " just got paid by " + owner.getName() + "'s credit card number " + owner.getCreditCardNumber());
    }

    void describeSelf() {
        System.out.println("edu.sla.allPets.Pet Sitter " + getName() + " has " + getFoodAmount() + " pieces of food and " + getPatienceAmount() + " remaining patience.");
        for (Pet pet: getPetsToSit()) {
            System.out.println("edu.sla.allPets.Pet Sitter " + getName() + " is taking care of " + pet.getName());
        }
    }

    ArrayList<Pet> getPetsToSit() {
        return petsToSit;
    }

    void setPetsToSit(ArrayList<Pet> petsToSit) {
        this.petsToSit = petsToSit;
    }

    int getFoodAmount() {
        return foodAmount;
    }

    void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    int getPatienceAmount() {
        return patienceAmount;
    }

    void setPatienceAmount(int patienceAmount) {
        this.patienceAmount = patienceAmount;
    }
}
