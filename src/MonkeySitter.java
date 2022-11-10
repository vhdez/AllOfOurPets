public class MonkeySitter {
    int age;

    int money;
    String location;

    String name;

    Owner owner;

    void describeSelf() {
        System.out.println("My name is " + name + ", I am " + age + " years old and I live in " + location + ".");
    }

    void sitMonkey(){
        if (owner != null && owner.moneyAmount > 0) {
            money = money + 1;
            System.out.println("Yay now I have $" + money);
        } else {
            System.out.println("I quit!");
        }
    }
}
