package b;

public class Lines {
    public static void main(String[] args) {
        boolean[][] lines = {
                {false, true, true, true, false},
                {true, false, false, true, true},
                {false, false, false, false, false},
                {false, true, false, false, true},
                {true, false, false, true, false}
        };
        printTrapStations(lines);
        int station = 4;
        System.out.println("direct lines to " + station + ": " + numOfDirectLinesTo(lines, station));

    }

    public static void printTrapStations(boolean[][] lines) {
        outer:
        for (int i = 0; i < lines.length; i++) {
            boolean[] destinations = lines[i];
            for (boolean x : destinations) {
                if (x) {
                    continue outer;
                }
            }
            System.out.println("Station " + i + " is a trap.");
        }
    }

    public static int numOfDirectLinesTo(boolean[][] lines, int station) {
        int result = 0;
        for (boolean[] arr : lines) {
            if (arr[station]) {
                result++;
            }
        }
        return result;
    }
}
