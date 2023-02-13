package Homework_1.Unit;

public class Bandit extends Character {
    int steal = 80;
    int hiding = 50;

    public Bandit(String name, int health, int attack, int protect, int luck) {
        super(name, health, attack, protect, luck);
    }

    public void setSteal(int steal) {
        this.steal = steal;
    }

    public void setHiding(int hiding) {
        this.hiding = hiding;
    }
}
