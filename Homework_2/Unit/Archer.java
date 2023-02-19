package Homework_2.Unit;

public abstract class Archer extends Character {
    String name;

    public Archer(int health, int attack, int protect, int luck, int shots, int maxShots, float dist) {
        super(health, attack, protect, luck);
        this.dist = dist;
        this.maxShots = maxShots;
        this.shots = shots;

    }

    int shots, maxShots;
    float dist;

    public float getDist() {
        return dist;
    }
}
