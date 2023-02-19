package Homework_2;

import java.util.ArrayList;

import Homework_2.Unit.Character;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Character.createTeam(list);
            System.out.println(list.get(i).getInfo());
        }

    }

}
