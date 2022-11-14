public class AnimalRescuer extends Person{

    String patience;

    String friendly;

    public AnimalRescuer(){
    }

    public AnimalRescuer(int age, String name, String occupation, String ethnicity, String gender, String height, String patience, String friendly) {
        super(age, name, occupation, ethnicity, gender, height);
        this.patience = patience;
        this.friendly = friendly;
    }
}
