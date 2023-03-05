package Homework_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import Homework_4.Unit.Character;

public class Main {
    public static ArrayList<Character> listTeam1 = new ArrayList<>();
    public static ArrayList<Character> listTeam2 = new ArrayList<>();
    public static ArrayList<Character> listAll = new ArrayList<>();

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        Character.createTeam1(listTeam1, 1);
        Character.createTeam2(listTeam2, 10);
        listAll.addAll(listTeam2);
        listAll.addAll(listTeam1);
        sortTeam(listAll);

        while (true) {
            View.view();
            user_input.nextLine();
            for (Character character : listAll) {
                if (listTeam1.contains(character)) {
                    character.step(listTeam1, listTeam2);
                } else {
                    character.step(listTeam2, listTeam1);
                }
            }
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
