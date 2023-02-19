package Homework_2.Unit;

public class Crossbowman extends Archer {

    public Crossbowman(int health, int attack, int protect, int luck, int shots, int maxShots, float dist) {
        super(health, attack, protect, luck, shots, maxShots, dist);

    }

    public Crossbowman(String name) {
        super(10, 6, 3, 4, 16, 16, 3);
        this.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Арбалетчик! Меня зовут " + name;
    }
}
