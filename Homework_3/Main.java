package Homework_3;

import java.util.ArrayList;
import java.util.Comparator;

import Homework_3.Unit.Character;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> listTeam1 = new ArrayList<>();
        System.out.println("Команда 1:");
        for (int i = 0; i < 10; i++) {
            Character.createTeam1(listTeam1);
            System.out.println(listTeam1.get(i).getInfo());
        }

        ArrayList<Character> listTeam2 = new ArrayList<>();
        System.out.println("Команда 2:");
        for (int i = 0; i < 10; i++) {
            Character.createTeam2(listTeam2);
            System.out.println(listTeam2.get(i).getInfo());
        }

        ArrayList<Character> listAll = new ArrayList<>(listTeam1);
        for (int index = 0; index < listTeam2.size(); index++) {
            listAll.add(listTeam2.get(index));
        }

        listAll.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {

                return o2.getSpeed() - o1.getSpeed();
            }
        });
        System.out.println(listAll.toString());
    }

}
