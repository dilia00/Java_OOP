package Homework_3.Unit;

public abstract class Archer extends Character {
    public Archer(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y,
            int shots, int maxShots, float dist) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);
        this.dist = dist;
        this.maxShots = maxShots;
        this.shots = shots;
    }

    String name;
    int shots, maxShots;
    float dist;

    public float getDist() {
        return dist;
    }
}
