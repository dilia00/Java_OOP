package Homework_2.Unit;

public abstract class Mage extends Character {

    public Mage(int health, int attack, int protect, int luck, int manna, float dist) {
        super(health, attack, protect, luck);
        this.manna = manna;
        this.dist = dist;
    }

    String name;
    int manna;
    float dist;

    public float getDist() {
        return dist;
    }
}
