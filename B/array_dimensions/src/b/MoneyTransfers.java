package b;

import java.util.Arrays;

public class MoneyTransfers {

    public static void main(String[] args) {
        int[][] transfers = {
                {0, 100, 0, 50},
                {30, 0, 44, 100},
                {1000, 400, 0, 300},
                {0, 0, 0, 0},
        };
        printBalance(transfers);
    }

    public static void printBalance(int[][] transfers) {
        int[] balance = new int[transfers.length];
        for (int i = 0; i < transfers.length; i++) {

            for (int j = 0; j < transfers[i].length; j++) {
                balance[i] += transfers[i][j];
                balance[j] -= transfers[i][i];
            }
        }
        System.out.println(Arrays.toString(balance));
    }
}

