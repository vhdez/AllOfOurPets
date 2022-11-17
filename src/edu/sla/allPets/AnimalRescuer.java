package edu.sla.allPets;

public class AnimalRescuer extends Person{

    int patience;

    int friendly;

    public AnimalRescuer(){
    }

    public AnimalRescuer(int age, String name, String occupation, String ethnicity, String gender, String height, int patience, int friendly) {
        super(age, name, occupation, ethnicity, gender, height);
        this.patience = patience;
        this.friendly = friendly;
    }

    @Override
    void describeSelf() {
        super.describeSelf();
        System.out.println("As an animal rescuer you need at least " + patience + " patience and " + friendly + " friendliness.");
    }
}
