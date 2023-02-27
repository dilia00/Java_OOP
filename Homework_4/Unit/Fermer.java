package Homework_4.Unit;

import java.util.ArrayList;

public class Fermer extends Character {

    public Fermer(int maxHp, int hp, int damage, int maxDamage, int attack, int protect, int speed, int x, int y,
            int delivery) {
        super(maxHp, hp, damage, maxDamage, attack, protect, speed, x, y);
        this.delivery = delivery;
    }

    int delivery;
    String name;

    public Fermer(String name, Vector2D coords) {
        this(1, 1, 1, 1, 1, 1, 3, coords.x, coords.y, 1);
        this.name = name;
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

        return "Я Крестьянин! Меня зовут " + name;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-10s %2d %2d %s", name, "Крестьянин", speed, hp, state);

    }

}
