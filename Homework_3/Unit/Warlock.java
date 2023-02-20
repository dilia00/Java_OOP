package Homework_3.Unit;

public class Warlock extends Mage {

    public Warlock(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y,
            int manna, float dist) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y, manna, dist);
        // TODO Auto-generated constructor stub
    }

    public Warlock(String name) {
        super(30, 30, -5, -5, 17, 12, 9, 0, 13, 1, 5.1f);
        this.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Колдун! Меня зовут " + name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", name, "Колдун", speed);

    }
}
