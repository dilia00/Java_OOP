package Homework_2.Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Character implements GameInterface {
    protected int health;
    protected int attack;
    protected int protect;
    protected int luck;

    public Character(int health, int attack, int protect, int luck) {
        this.health = health;
        this.attack = attack;
        this.protect = protect;
        this.luck = luck;
    }

    public static void createTeam(ArrayList<Character> list) {
        switch (getСharacters()) {
            case "Bandit" -> list.add(new Bandit(getName()));
            case "Crossbowman" -> list.add(new Crossbowman(getName()));
            case "Fermer" -> list.add(new Fermer(getName()));
            case "Monk" -> list.add(new Monk(getName()));
            case "Pikeman" -> list.add(new Pikeman(getName()));
            case "Sniper" -> list.add(new Sniper(getName()));
            case "Warlock" -> list.add(new Warlock(getName()));
        }
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

    private static String getСharacters() {
        return String.valueOf(Сharacters.values()[new Random().nextInt(Сharacters.values().length - 1)]);
    }

    public void setHealth(int health) {
        if (health >= 0)
            this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setAttack(int attack) {
        if (attack >= 0)
            this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setLuck(int luck) {
        if (luck >= 0)
            this.luck = luck;
    }

    public int getLuck() {
        return luck;
    }

    public void setProtect(int protect) {
        if (protect >= 0)
            this.protect = protect;
    }

    public int getProtect() {
        return protect;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я человек! ";
    };
}
