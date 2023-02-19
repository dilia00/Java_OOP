package Homework_2.Unit;

public class Sniper extends Archer {

    public Sniper(String name) {
        super(15, 12, 10, 1, 32, 32, 5);
        super.name = name;
    }

    @Override
    public String getInfo() {

        return "Я Cнайпер! Меня зовут " + name;
    }
}
