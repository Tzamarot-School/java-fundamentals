

public class Demo5 {


    public static void main(String[] args) {
        int x = 5;
        double y = 6.32;
        System.out.println("x=" + x + ", y=" + y);
        double temp = y;
        // implicit casting
        y = x;
        // explicit casting
        x = (int) temp;
        System.out.println("x=" + x + ", y=" + y);
        // parsing a String to a numeral
        String str = "25";
        int num = Integer.parseInt(str);
    }
}
