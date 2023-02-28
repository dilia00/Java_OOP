package Homework_4.Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Character implements GameInterface {
    protected int hp, maxHp;
    protected int damage, maxDamage;
    protected int attack;
    protected int protect;
    protected int speed;
    protected Vector2D coords;
    String name;
    static final int UNITS = 10;
    public String state;

    public Character(int maxHp, int hp, int damage, int maxDamage,
            int attack, int protect, int speed, int x, int y) {
        this.maxHp = maxHp;
        this.hp = hp;
        this.damage = damage;
        this.maxDamage = maxDamage;
        this.attack = attack;
        this.protect = protect;
        this.speed = speed;
        coords = new Vector2D(x, y);
        state = "Stand";
    }

    public static void createTeam1(ArrayList<Character> list, int y) {
        for (int i = 0; i < UNITS; i++) {
            switch (getСharacters()) {
                case "Bandit", "Pikeman" -> list.add(new Bandit(getName(), new Vector2D(i + 1, y)));
                case "Fermer" -> list.add(new Fermer(getName(), new Vector2D(i + 1, y)));
                case "Sniper", "Crossbowman" -> list.add(new Sniper(getName(), new Vector2D(i + 1, y)));
                case "Warlock", "Monk" -> list.add(new Warlock(getName(), new Vector2D(i + 1, y)));
            }
        }

    }

    public static void createTeam2(ArrayList<Character> list, int y) {
        for (int i = 0; i < UNITS; i++) {
            switch (getСharacters()) {
                case "Crossbowman", "Sniper" -> list.add(new Crossbowman(getName(), new Vector2D(i + 1, y)));
                case "Fermer" -> list.add(new Fermer(getName(), new Vector2D(i + 1, y)));
                case "Monk", "Warlock" -> list.add(new Monk(getName(), new Vector2D(i + 1, y)));
                case "Pikeman", "Bandit" -> list.add(new Pikeman(getName(), new Vector2D(i + 1, y)));
            }
        }
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    private static String getСharacters() {
        return String.valueOf(Сharacters.values()[new Random().nextInt(Сharacters.values().length)]);
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    protected void getDamage(float damage) {
        hp -= damage;
        if (hp > maxHp)
            hp = maxHp;
        if (hp <= 0) {
            state = "Die";
            hp = 0;
        }
    }

    protected float identifyDamage(ArrayList<Character> team, int index) {
        if (team.get(index).protect - attack > 0)
            return damage;
        if (team.get(index).protect - attack < 0)
            return maxDamage;
        else
            return (damage + maxDamage) / 2;

    }

    @Override
    public void step(ArrayList<Character> team1, ArrayList<Character> team2) {

    }

    protected int findNearest(ArrayList<Character> team) {
        int index = 0;
        double min = 100;
        for (int i = 0; i < team.size(); i++) {
            if (min > coords.getDistance(team.get(i).coords) && !team.get(i).state.equals("Die")) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }

    protected int findHurt(ArrayList<Character> team) {
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).hp < team.get(i).maxHp) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public String getInfo() {
        return "Я человек!";
    };

    @Override
    public String toString() {
        return String.format("%-6s %-10s %2d %2d %s", name, "Человек", speed, hp, state);

    }
}
