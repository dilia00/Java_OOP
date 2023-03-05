package Homework_4.Unit;

public class Monk extends Mage {

    public Monk(String name, Vector2D coords) {
        super(name, 30, 30, -8, -8, 12, 7, 5, coords.x, coords.y);
        super.state = state;
    }

    @Override
    public String getInfo() {
        return "Монах! Меня зовут " + name;
    }
}
