package Homework_4.Unit;

public class Crossbowman extends Archer {

    public Crossbowman(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y,
            int shots, int maxShots, float dist) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y, shots, maxShots, dist);

    }

    public Crossbowman(String name, Vector2D coords) {
        super(10, 10, 2, 3, 6, 16, 9, coords.x, coords.y, 16, 16, 3.1f);
        this.name = name;
        super.state = state;
    }

    @Override
    public String getInfo() {

        return "Я Арбалетчик! Меня зовут " + name;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-10s %2d %2d %-3s %2d", name, "Арбалетчик", speed, hp, state, shots);

    }
}
