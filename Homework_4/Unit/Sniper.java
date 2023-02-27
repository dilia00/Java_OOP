package Homework_4.Unit;

public class Sniper extends Archer {
    public Sniper(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y,
            int shots, int maxShots, float dist) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y, shots, maxShots, dist);
    }

    public Sniper(String name, Vector2D coords) {
        super(15, 15, 8, 10, 12,
                10, 9, coords.x, coords.y, 10, 10, 3.1f);
        this.name = name;
        super.state = state;
    }

    @Override
    public String getInfo() {

        return "Я Cнайпер! Меня зовут " + name;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-10s %2d %2d %s", name, "Cнайпер", speed, hp, state);

    }
}
