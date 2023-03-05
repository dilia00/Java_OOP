package Homework_4.Unit;

public class Bandit extends Soldier {
    public Bandit(String name, Vector2D coords) {
        super(name, 10, 10, 1, 3, 4,
                5, 4, coords.x, coords.y);
        super.state = state;
    }

    @Override
    public String getInfo() {
        return "Разбойник! Меня зовут " + name;
    }
}
