package Homework_4.Unit;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Character> team1, ArrayList<Character> team2);

    String getInfo();

}
