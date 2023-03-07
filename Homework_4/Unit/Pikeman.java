package Homework_4.Unit;

public class Pikeman extends Soldier {

    public Pikeman(String name, Vector2D coords) {
        super(name, 12, 12, 3, 5, 4, 7,
                4, coords.x, coords.y);
        super.state = state;
    }

    @Override
    public String getInfo() {
        return "Копейщик! Меня зовут " + name;
    }
}
