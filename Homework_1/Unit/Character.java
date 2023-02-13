package Homework_1.Unit;

public class Character {
    protected String name;
    protected int health;
    protected int attack;
    protected int protect;
    protected int luck;

    public Character(String name, int health, int attack, int protect, int luck) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.protect = protect;
        this.luck = luck;
    }

    public int getHealth() {
        return 0;
    }

    public int getAttack() {
        return 0;
    }

    public int getProtect() {
        return 0;
    }

    public int getLuck() {
        return luck;
    }
}
