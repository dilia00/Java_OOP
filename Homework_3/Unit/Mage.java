package Homework_3.Unit;

public abstract class Mage extends Character {

    public Mage(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y,
            int manna, float dist) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);
        this.manna = manna;
        this.dist = dist;
    }

    // public Mage(int health, int attack, int protect, int luck, int manna, float
    // dist) {
    // super(health, attack, protect, luck);

    // }

    String name;
    int manna;
    float dist;

    public float getDist() {
        return dist;
    }
}
