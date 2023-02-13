package Homework_1.Unit;

public class Crossbowman extends Character {
    int hiding = 5;
    int cartridges = 20;

    public Crossbowman(String name, int health, int attack, int protect, int luck) {
        super(name, health, attack, protect, luck);

    }

    public void setCartridges(int cartridges) {
        this.cartridges = cartridges;
    }

    public void setHiding(int hiding) {
        this.hiding = hiding;
    }

    @Override
    public int getAttack() {
        return super.getAttack();
    }
}
