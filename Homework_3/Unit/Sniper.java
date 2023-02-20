package Homework_3.Unit;

public class Sniper extends Archer {
    public Sniper(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y,
            int shots, int maxShots, float dist) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y, shots, maxShots, dist);
    }

    public Sniper(String name) {
        super(15, 15, 8, 10, 12, 10, 9, 0, 10, 32, 32, 3.1f);
        this.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Cнайпер! Меня зовут " + name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", name, "Cнайпер", speed);

    }
}
