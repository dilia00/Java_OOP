package Homework_2.Unit;

public class Monk extends Mage {

    public Monk(int health, int attack, int protect, int luck, int manna, float dist) {
        super(health, attack, protect, luck, manna, dist);

    }

    public Monk(String name) {
        super(30, 12, 7, 4, 1, 3);
        this.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Монах! Меня зовут " + name;
    }

}
