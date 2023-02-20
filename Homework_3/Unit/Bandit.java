package Homework_3.Unit;

public class Bandit extends Soldier {

    public Bandit(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);
    }

    public Bandit(String name) {
        super(10, 10, 1, 3, 4, 5, 4, 0, 11);
        this.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Разбойник! Меня зовут " + name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", name, "Разбойник", speed);

    }
}
