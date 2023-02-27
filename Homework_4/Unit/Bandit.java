package Homework_4.Unit;

public class Bandit extends Soldier {

    public Bandit(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);
    }

    public Bandit(String name, Vector2D coords) {
        super(10, 10, 1, 3, 4,
                5, 4, coords.x, coords.y);
        this.name = name;
        super.state = state;
    }

    @Override
    public String getInfo() {

        return "Я Разбойник! Меня зовут " + name;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-10s %2d %2d %s", name, "Разбойник", speed, hp, state);

    }
}
