package Homework_3.Unit;

public class Fermer extends Character {

    public Fermer(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y,
            int delivery) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);
        this.delivery = delivery;
    }

    int delivery;
    String name;

    public Fermer(String name) {
        this(1, 1, 1, 1, 1, 1, 3, 0, 3, 1);
        this.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Крестьянин! Меня зовут " + name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", name, "Крестьянин", speed);

    }
}
