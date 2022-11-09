public class capybara extends Pet{
    String fur;
    boolean hasClaws;

    public capybara(){
    }

    public capybara(String size, String color, int age, int energy, String name, Owner owner, String fur, boolean hasClaws) {
        super(size, color, age, energy, name, owner);
        this.fur = fur;
        this.hasClaws = hasClaws;
    }

    void describeSelf() {
        System.out.println("Squeak!  I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " capybara with " + fur + " fur.");
    }

    void swim() {
        System.out.println(name + " went for a swim.");
    }

    void sleep() {
        energy = energy + 1;
        System.out.println(name + " went to sleep");
    }

    void eat() {
        energy = energy + 1;
        System.out.println("Yumm, now " + name + "'s energy is at " + energy);
    }
}
