package edu.sla.allPets;

public class PetStoreOwner extends Person {
    boolean experienced;
    int patience;

    public PetStoreOwner(int age, String name, String occupation, String ethnicity, String gender, String height, boolean experienced, int patience) {
        super(age, name, occupation, ethnicity, gender, height);
        this.experienced = experienced;
        this.patience = patience;
    }

    @Override
    void describeSelf() {
        super.describeSelf();
        System.out.println("It is "+ experienced + " that I am skilled at my job and that my patience level is at " + patience + ".");
    }
}