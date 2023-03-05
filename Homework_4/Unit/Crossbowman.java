package Homework_4.Unit;

public class Crossbowman extends Archer {

    public Crossbowman(String name, Vector2D coords) {
        super(name, 10, 10, 2, 3, 6, 16, 9, coords.x, coords.y, 16, 16, 3.1f);
        super.state = state;
    }

    @Override
    public String getInfo() {

        return "Арбалетчик! Меня зовут " + name;
    }
}
