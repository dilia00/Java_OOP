package Homework_4.Unit;

public class Monk extends Mage {

    public Monk(String name, Vector2D coords) {
        super(name, 20, 20, -5, -5, 12, 7, 5, coords.x, coords.y);
        super.state = state;
    }

    @Override
    public String getInfo() {
        return "Монах! Меня зовут " + name;
    }
}
