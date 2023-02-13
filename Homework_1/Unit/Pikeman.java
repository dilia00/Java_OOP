package Homework_1.Unit;

public class Pikeman extends Character {

    public Pikeman(String name, int health, int attack, int protect, int luck) {
        super(name, health, attack, protect, luck);
    }

    @Override
    public int getAttack() {
        return this.attack;
    }
}
