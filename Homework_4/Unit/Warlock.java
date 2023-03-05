package Homework_4.Unit;

public class Warlock extends Mage {

    public Warlock(String name, Vector2D coords) {
        super(name, 30, 30, -4, -4, 17, 12, 5,
                coords.x, coords.y);
        this.name = name;
        super.state = state;
    }

    @Override
    public String getInfo() {
        return "Варлок! Меня зовут " + name;
    }
}
