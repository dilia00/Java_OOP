package Homework_4.Unit;

public class Monk extends Mage {

    public Monk(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y,
            int manna, float dist) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y, manna, dist);

    }

    public Monk(String name, Vector2D coords) {
        super(30, 30, -8, -8, 12, 7, 5, coords.x, coords.y, 1, 5.1f);
        this.name = name;
        super.state = state;
    }

    @Override
    public String getInfo() {

        return "Я Монах! Меня зовут " + name;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-10s %2d %2d %s", name, "Монах", speed, hp, state);

    }
}
