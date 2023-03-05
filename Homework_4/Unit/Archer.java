package Homework_4.Unit;

import java.util.ArrayList;

public abstract class Archer extends Character {
    int shots, maxShots;
    float dist;

    public Archer(String name, int maxHp, int hp, int damage, int maxDamage, int attack, int protect,
            int speed, int x, int y, int shots, int maxShots, float dist) {
        super(name, maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);
        this.dist = dist;
        this.maxShots = maxShots;
        this.shots = shots;
    }

    public float getDist() {
        return dist;
    }

    @Override
    public void step(ArrayList<Character> team1, ArrayList<Character> team2) {
        if (state.equals("Die") || shots == 0)
            return;
        int target = findNearest(team2);
        if (target == -1)
            return;
        team2.get(target).getDamage(identifyDamage(team2, target));
        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getInfo().equals("Фермер!")
                    && team1.get(i).state.equals("Stand")) {
                team1.get(i).state = "Busy";
                return;
            }
        }
        shots--;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " P:" + protect +
                " A:" + attack +
                " D:" + Math.round(Math.abs((damage + maxDamage) / 2)) +
                " S" + shots +
                " " + state;
    }
}
