package Homework_4.Unit;

import java.util.ArrayList;

public abstract class Mage extends Character {

    public Mage(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y,
            int manna, float dist) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);
        this.manna = manna;
        this.dist = dist;
    }

    String name;
    int manna;
    float dist;

    public float getDist() {
        return dist;
    }

    @Override
    public void step(ArrayList<Character> team1, ArrayList<Character> team2) {
        if (state.equals("Die"))
            return;
        int target = findHurt(team1);
        team1.get(target).getDamage(maxDamage);
    }
}
