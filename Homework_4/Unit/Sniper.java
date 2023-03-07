package Homework_4.Unit;

public class Sniper extends Archer {

    public Sniper(String name, Vector2D coords) {
        super(name, 15, 15, 8, 10, 12,
                10, 9, coords.x, coords.y, 15, 15, 3.1f);
        super.state = state;
    }

    @Override
    public String getInfo() {
        return "Cнайпер! Меня зовут " + name;
    }
}
