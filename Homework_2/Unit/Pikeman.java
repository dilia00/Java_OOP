package Homework_2.Unit;

public class Pikeman extends Soldier {

    public Pikeman(int health, int attack, int protect, int luck, int damage) {
        super(health, attack, protect, luck, damage);

    }

    public Pikeman(String name) {
        super(10, 4, 5, 2, 3);
        this.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Копейщик! Меня зовут " + name;
    }
}
