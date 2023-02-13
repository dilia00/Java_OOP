package Homework_1.Unit;

public class Warlock extends Character {
    int mana = 100;
    int curse = 20;

    public Warlock(String name, int health, int attack, int protect, int luck) {
        super(name, health, attack, protect, luck);

    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    @Override
    public int getAttack() {

        return this.curse;
    }

}