package Homework_2.Unit;

public class Fermer extends Character {
    int delivery;
    String name;

    public Fermer(int health, int attack, int protect, int luck, int delivery) {
        super(health, attack, protect, luck);
        this.delivery = delivery;

    }

    public Fermer(String name) {
        this(1, 1, 1, 0, 11);
        this.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Крестьянин! Меня зовут " + name;
    }

}
