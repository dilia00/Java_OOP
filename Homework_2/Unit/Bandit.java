package Homework_2.Unit;

public class Bandit extends Soldier {

    public Bandit(int health, int attack, int protect, int luck, int damage) {
        super(health, attack, protect, luck, damage);

    }

    public Bandit(String name) {
        super(10, 8, 3, 4, 4);
        this.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Разбойник! Меня зовут " + name;
    }
}
