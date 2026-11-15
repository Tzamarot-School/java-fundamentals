package a;

import java.util.Scanner;

public class Demo1UI {

    private static final int studentCount = 10;
    private static final int gradesCount = 7;
    private static final String[][] studentGrades = new String[studentCount][gradesCount];
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        String choice = sc.nextLine();
        while (!choice.equals("q")) {
            switch (choice) {
                case "m":
                    showMenu();
                    break;
                case "cs":
                    System.out.println("Student count = " + studentCount);
                    break;
                case "cg":
                    System.out.println("Grades count = " + gradesCount);
                    break;
                case "all":
                    showAllGrades();
                    break;
                default:
                    System.out.println("choice " + choice + " not supported!");
            }
            System.out.println("=============================");
            System.out.print("Enter choice: ");
            choice = sc.nextLine();
        }
        destroy();
    }

    private static void showAllGrades() {
        for (String[] arr: studentGrades) {
            System.out.print("[");
            for (int j = 0; j < arr.length - 1; j++) {
                System.out.print(arr[j] + ", \t");
            }

            System.out.println(arr[arr.length-1] + "]");
        }
    }

    private static void destroy() {
        sc.close();
        System.out.println("Bye");
    }

    private static void showMenu() {
        System.out.println("======= App Menu ============");
        System.out.println("Show Menu .................. m");
        System.out.println("Show Number of Students .... cs");
        System.out.println("Show Number of grades ...... cg");
        System.out.println("Show all grades ............ all");
        System.out.println("Quit ....................... q");
        System.out.println("=============================");
        System.out.print("Enter Choice: ");
    }
}
