package edu.sla.allPets;

public class PetStoreOwner extends Person {
    private boolean experienced;
    private int patience;

    public PetStoreOwner(int age, String name, String occupation, String ethnicity, String gender, String height, boolean experienced, int patience) {
        super(age, name, occupation, ethnicity, gender, height);
        this.setExperienced(experienced);
        this.setPatience(patience);
    }

    @Override
    void describeSelf() {
        super.describeSelf();
        System.out.println("It is "+ isExperienced() + " that I am skilled at my job and that my patience level is at " + getPatience() + ".");
    }

    boolean isExperienced() {
        return experienced;
    }

    void setExperienced(boolean experienced) {
        this.experienced = experienced;
    }

    int getPatience() {
        return patience;
    }

    void setPatience(int patience) {
        this.patience = patience;
    }
}