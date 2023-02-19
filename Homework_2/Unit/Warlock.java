package Homework_2.Unit;

public class Warlock extends Mage {

    public Warlock(int health, int attack, int protect, int luck, int manna, float dist) {
        super(health, attack, protect, luck, manna, dist);
    }

    public Warlock(String name) {
        super(30, 17, 12, 1, 1, 3);
        this.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Колдун! Меня зовут " + name;
    }

}
