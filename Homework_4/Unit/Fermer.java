package Homework_4.Unit;

import java.util.ArrayList;

public class Fermer extends Character {
    int delivery;

    protected Fermer(String name, int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed,
            int x, int y, int delivery) {
        super(name, maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);
        this.delivery = delivery;
    }

    public Fermer(String name, Vector2D coords) {
        this(name, 1, 1, 1, 1, 1, 1, 3, coords.x, coords.y, 1);
        super.state = state;
    }

    @Override
    public void step(ArrayList<Character> team1, ArrayList<Character> team2) {
        if (!state.equals("Die"))
            state = "Stand";
        else
            return;
    }

    @Override
    public String getInfo() {
        return "Фермер!";
    }

}
