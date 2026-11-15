package b;

import java.util.Arrays;

public class MoneyTransfers {

    public static void main(String[] args) {
        int[][] transfers = {
                {0, 5, 0, 6},
                {9, 0, 0, 1},
                {1, 4, 0, 6},
                {0, 0, 7, 0},
        };
        printBalance(transfers);
        int memberIndex = bestLender(transfers);
        System.out.println("best giver is #" +memberIndex);
    }

    public static int bestLender(int[][] transfers){
        int[] points = new int[transfers.length];
        for (int i = 0; i < transfers.length; i++) {
            for (int j = 0; j < transfers[i].length; j++) {
                if(transfers[i][j]!=0) points[j] +=1;
            }
        }
        int max = points[0];
        int maxInd = 0;
        for (int i = 0; i < points.length; i++) {
            if(points[i]>max){
                max = points[i];
                maxInd = i;
            }
        }
        return maxInd;
    }

    public static void printBalance(int[][] transfers) {
        int[] balance = new int[transfers.length];
        for (int i = 0; i < transfers.length; i++) {

            for (int j = 0; j < transfers[i].length; j++) {
                balance[i] += transfers[i][j];
                balance[j] -= transfers[i][j];
            }
        }
        for (int i = 0; i < balance.length; i++) {
            System.out.println("Member #" + i + " balance is: " + balance[i]);

        }
    }
}

