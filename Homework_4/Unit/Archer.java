package Homework_4.Unit;

import java.util.ArrayList;

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

    @Override
    public void step(ArrayList<Character> team1, ArrayList<Character> team2) {
        if (state.equals("Die") || shots == 0)
            return;
        int target = findNearest(team2);
        team2.get(target).getDamage(identifyDamage(team2, target));
        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getInfo().equals("Крестьянин")
                    && team1.get(i).state.equals("Stand")) {
                team1.get(i).state = "Busy";
                return;
            }
        }
        shots--;
    }
}
