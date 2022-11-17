package edu.sla.allPets;

public class AnimalRescuer extends Person{
    private int patience;
    private int friendly;

    public AnimalRescuer(int age, String name, String occupation, String ethnicity, String gender, String height, int patience, int friendly) {
        super(age, name, occupation, ethnicity, gender, height);
        this.setPatience(patience);
        this.setFriendly(friendly);
    }

    @Override
    void describeSelf() {
        super.describeSelf();
        System.out.println("As an animal rescuer you need at least " + getPatience() + " patience and " + getFriendly() + " friendliness.");
    }

    int getPatience() {
        return patience;
    }

    void setPatience(int patience) {
        this.patience = patience;
    }

    int getFriendly() {
        return friendly;
    }

    void setFriendly(int friendly) {
        this.friendly = friendly;
    }
}
