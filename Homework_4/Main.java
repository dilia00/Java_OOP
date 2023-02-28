package Homework_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import Homework_4.Unit.Character;

public class Main {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        ArrayList<Character> listTeam1 = new ArrayList<>();
        ArrayList<Character> listTeam2 = new ArrayList<>();

        Character.createTeam1(listTeam1, 1);
        Character.createTeam2(listTeam2, 10);
        ArrayList<Character> listAll = new ArrayList<>(listTeam1);
        for (int index = 0; index < listTeam2.size(); index++) {
            listAll.add(listTeam2.get(index));
        }
        sortTeam(listAll);
        sortTeam(listTeam1);
        sortTeam(listTeam2);
        printTeam(listTeam1, 1);
        printTeam(listTeam2, 2);
        while (true) {
            user_input.nextLine();
            for (Character character : listAll) {
                if (listTeam1.contains(character)) {
                    character.step(listTeam1, listTeam2);

                } else {
                    character.step(listTeam2, listTeam1);

                }
            }
            printTeam(listTeam1, 1);
            printTeam(listTeam2, 2);
        }
    }

    static void printTeam(ArrayList<Character> team, int num) {
        System.out.println("Команда " + num + ":");
        for (Character character : team) {
            System.out.println(character.toString());
        }

    }

    static void sortTeam(ArrayList<Character> team) {
        team.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if (o2.getSpeed() == o1.getSpeed())
                    return (int) (o2.getHp() - o1.getHp());
                else
                    return (int) o2.getSpeed() - o1.getSpeed();
            }
        });
    }

}
