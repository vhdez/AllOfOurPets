package edu.sla.allPets;

public class MonkeySitter {
    private int age;
    private int money;
    private String location;
    private String name;
    private Owner owner;

    public MonkeySitter(int age, int money, String location, String name, Owner owner) {
        this.setAge(age);
        this.setMoney(money);
        this.setLocation(location);
        this.setName(name);
        this.setOwner(owner);
    }

    void describeSelf() {
        System.out.println("My name is " + getName() + ", I am " + getAge() + " years old and I live in " + getLocation() + ".");
    }

    void sitMonkey(){
        if (getOwner() != null && getOwner().getMoneyAmount() > 0) {
            setMoney(getMoney() + 1);
            System.out.println("Yay now I have $" + getMoney());
        } else {
            System.out.println("I quit!");
        }
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getMoney() {
        return money;
    }

    void setMoney(int money) {
        this.money = money;
    }

    String getLocation() {
        return location;
    }

    void setLocation(String location) {
        this.location = location;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Owner getOwner() {
        return owner;
    }

    void setOwner(Owner owner) {
        this.owner = owner;
    }
}
