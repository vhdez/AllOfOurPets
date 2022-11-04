public class Parrot {
    //fields
    String color;

    String size;

    int age;

    int energy;

    String name;

    Owner owner;

    void describeSelf() {
        System.out.println("Squawk!  I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " parrot");
    }

    void eat() {
        energy = energy + 1;
        System.out.println("Yum, now " + name + "'s energy is at " + energy);
    }

    void talk(){
        System.out.println( name  + " wants a cracker ");
    }
}
