package Homework_3.Unit;

public abstract class Soldier extends Character {

    public Soldier(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);

    }

    String name;

    public int getDamage() {
        return damage;
    }
}
