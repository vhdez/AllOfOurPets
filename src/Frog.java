public class Frog extends Pet {
   //Fields
    String texture;
    String croakSound;

    //Constructors
    public Frog(){
    }

    public Frog(String size, String color, int age, int energy, String name, String croakSound, String texture, Owner owner){
        super(size, color, age, energy, name, owner);
        this.texture = texture;
        this.croakSound = croakSound;
    }

    //Methods
    void describeSelf() {
        System.out.println("Ribbit!  I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " frog with a" + croakSound + " croak.");
    }
    void eat() {
        energy = energy + 1;
        System.out.println("Yum, now " + name + "'s fullness is at " + energy );
    }
    void croak() {
        System.out.println(name + " crooooooaks a hello.");
    }

    void leap(){System.out.println(name + " leaps over Fifi.");}

}
