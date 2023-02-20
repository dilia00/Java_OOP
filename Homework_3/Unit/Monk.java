package Homework_3.Unit;

public class Monk extends Mage {

    public Monk(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y,
            int manna, float dist) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y, manna, dist);

    }

    public Monk(String name) {
        super(30, 30, -4, -4, 12, 7, 5, 0, 12, 1, 5.1f);
        this.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Монах! Меня зовут " + name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", name, "Монах", speed);

    }
}
