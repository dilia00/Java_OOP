package Homework_3.Unit;

public class Pikeman extends Soldier {

    public Pikeman(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);
    }

    public Pikeman(String name) {
        super(10, 10, 1, 3, 4, 5, 4, 0, 11);
        this.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Копейщик! Меня зовут " + name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", name, "Копейщик", speed);

    }
}
