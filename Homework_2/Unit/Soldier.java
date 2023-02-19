package Homework_2.Unit;

public abstract class Soldier extends Character {

    String name;

    public Soldier(int health, int attack, int protect, int luck, int damage) {
        super(health, attack, protect, luck);
        this.damage = damage;

    }

    int damage;

    public int getDamage() {
        return damage;
    }
}
