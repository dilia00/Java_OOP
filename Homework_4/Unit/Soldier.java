package Homework_4.Unit;

import java.util.ArrayList;

public abstract class Soldier extends Character {
    protected Soldier(String name, int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed,
            int x, int y) {
        super(name, maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void step(ArrayList<Character> team1, ArrayList<Character> team2) {
        if (state.equals("Die"))
            return;
        int target = findNearest(team2);
        if (target == -1)
            return;
        if (coords.getDistance(team2.get(target).coords) <= 2) {
            team2.get(target).getDamage(identifyDamage(team2, target));
            return;
        }
        if (coords.getDown(team2.get(target).coords)) {
            if (coords.y - 1 > team2.get(target).coords.y && coords.getEmpty(team1, coords.x, coords.y - 1))
                coords.y--;
        } else if (!coords.getDown(team2.get(target).coords)) {
            if (coords.y + 1 < team2.get(target).coords.y && coords.getEmpty(team1, coords.x, coords.y + 1))
                coords.y++;
        }
        if (coords.getLeft(team2.get(target).coords)) {
            if (coords.x - 1 > team2.get(target).coords.x && coords.getEmpty(team1, coords.x - 1, coords.y))
                coords.x--;
        } else if (!coords.getLeft(team2.get(target).coords)) {
            if (coords.x + 1 < team2.get(target).coords.x && coords.getEmpty(team1, coords.x + 1, coords.y))
                coords.x++;
        }
    }
}
