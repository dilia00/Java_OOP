package Homework_1.Unit;

public class Sniper extends Character {
    int accuracy = 70;
    int cartridges = 20;
    int hiding = 100;

    public Sniper(String name, int health, int attack, int protect, int luck) {
        super(name, health, attack, protect, luck);

    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setHiding(int hiding) {
        this.hiding = hiding;
    }

    public void setCartridges(int cartridges) {
        this.cartridges = cartridges;
    }
}
