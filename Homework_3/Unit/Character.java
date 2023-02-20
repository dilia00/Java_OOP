package Homework_3.Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Character implements GameInterface {
    protected int hp, maxHp;
    protected int damage, maxDamage;
    protected int attack;
    protected int protect;
    protected int speed;
    protected int x, y;
    String name;

    public Character(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y) {
        this.maxHp = maxHp;
        this.hp = hp;
        this.damage = damage;
        this.maxDamage = maxDamage;
        this.attack = attack;
        this.protect = protect;
        this.speed = speed;
    }

    public static void createTeam1(ArrayList<Character> list) {
        switch (getСharacters()) {
            case "Bandit", "Pikeman" -> list.add(new Bandit(getName()));
            case "Fermer" -> list.add(new Fermer(getName()));
            case "Sniper", "Crossbowman" -> list.add(new Sniper(getName()));
            case "Warlock", "Monk" -> list.add(new Warlock(getName()));
        }
    }

    public static void createTeam2(ArrayList<Character> list) {
        switch (getСharacters()) {
            case "Crossbowman", "Sniper" -> list.add(new Crossbowman(getName()));
            case "Fermer" -> list.add(new Fermer(getName()));
            case "Monk", "Warlock" -> list.add(new Monk(getName()));
            case "Pikeman", "Bandit" -> list.add(new Pikeman(getName()));
        }
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    private static String getСharacters() {
        return String.valueOf(Сharacters.values()[new Random().nextInt(Сharacters.values().length)]);
    }

    public void setHp(int hp) {
        if (hp >= 0)
            this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setAttack(int attack) {
        if (attack >= 0)
            this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setProtect(int protect) {
        if (protect >= 0)
            this.protect = protect;
    }

    public int getProtect() {
        return protect;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я человек! ";
    };

    @Override
    public String toString() {
        return String.format("%s %s %d", name, "Человек", speed);

    }
}
