package Homework_4.Unit;

import java.util.ArrayList;

public abstract class Mage extends Character {
    protected Mage(String name, int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x,
            int y) {
        super(name, maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);
    }

    @Override
    public void step(ArrayList<Character> team1, ArrayList<Character> team2) {
        if (state.equals("Die"))
            return;
        int target = findHurt(team1);
        if (target == -1)
            return;
        team1.get(target).getDamage(maxDamage);
    }
}
