package a;

import java.util.Scanner;

public class Tar1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of buttons for day 1: ");
//        int buttonsDay1 = sc.nextInt();
        int buttonsDay1 = 1250;
//        System.out.print("Enter number of buttons for day 2: ");
//        int buttonsDay2 = sc.nextInt();
        int buttonsDay2 = 599;
//        System.out.print("Enter number of buttons for day 3: ");
//        int buttonsDay3 = sc.nextInt();
        int buttonsDay3 = 601;

        int fullPacksDay1 = buttonsDay1 / 12;
        int fullPacksDay2 = buttonsDay2 / 12;
        int fullPacksDay3 = buttonsDay3 / 12;

        int fullBoxesDay1 = fullPacksDay1 / 50;
        int fullBoxesDay2 = fullPacksDay2 / 50;
        int fullBoxesDay3 = fullPacksDay3 / 50;

        int orphanPacksDay1 = buttonsDay1 % 12;
        int orphanPacksDay2 = fullPacksDay2 % fullBoxesDay2;
        int orphanPacksDay3 = fullPacksDay3 % fullBoxesDay3;

        int orphanButtonsDay1 = buttonsDay1 % 12;
        int orphanButtonsDay2 = buttonsDay2 % 12;
        int orphanButtonsDay3 = buttonsDay3 % 12;
        System.out.println("==============================");
        System.out.println("Full packs day 1 = " + fullPacksDay1);
        System.out.println("Full packs day 2 = " + fullPacksDay2);
        System.out.println("Full packs day 3 = " + fullPacksDay3);
        System.out.println("Full boxes day 1 = " + fullBoxesDay1);
        System.out.println("Full boxes day 2 = " + fullBoxesDay2);
        System.out.println("Full boxes day 3 = " + fullBoxesDay3);
        System.out.println("Orphan packs day 1 = " + orphanPacksDay1);
        System.out.println("Orphan packs day 2 = " + orphanPacksDay2);
        System.out.println("Orphan packs day 3 = " + orphanPacksDay3);
        System.out.println("Orphan buttons day 1 = " + orphanButtonsDay1);
        System.out.println("Orphan buttons day 2 = " + orphanButtonsDay2);
        System.out.println("Orphan buttons day 3 = " + orphanButtonsDay3);

        sc.close();
        Integer x = 5;
        int y = 5;
        System.out.println(x.equals(y));

    }
}
