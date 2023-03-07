package Homework_4.Unit;

import java.util.ArrayList;

public class Vector2D {
    protected int x;
    protected int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected double getDistance(Vector2D oponent) {
        return Math.sqrt(Math.pow(x - oponent.x, 2) + Math.pow(y - oponent.y, 2));
    }

    // protected boolean onTheLeft(Vector2D oponent) {
    // return (x < oponent.x) ? false : true;
    // }

    // protected boolean onTheTop(Vector2D oponent) {
    // return (y > oponent.y) ? false : true;
    // }
    protected boolean getLeft(Vector2D oponent) {
        return oponent.x < x;
    }

    protected boolean getDown(Vector2D oponent) {
        return oponent.y < y;
    }

    protected boolean getEmpty(ArrayList<Character> team, int posX, int posY) {
        boolean b = true;
        for (Character character : team) {
            if (character.coords.x == posX && character.coords.y == posY) {
                b = false;
                break;
            }
        }
        return b;
    }
}
