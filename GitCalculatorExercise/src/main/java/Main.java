import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final List<Integer> list = new ArrayList<Integer>();

        Calculator calc = new Calculator() {
            public int getMaximum() {
                int max = 0;
                for (int value : list) {
                    if (max < value)
                        max = value;
                }
                return max;
            }

            public int getMinimum() {
                int min = list.get(0);
                for (int value : list) {
                    if (min > value)
                        min = value;
                }

                return min;
            }

            public void addValue(int value) {
                list.add(value);
            }

            public int sum() {
                int result = 0;
                for (int value : list) {
                    result += value;
                }
                return result;}
        };

        calc.addValue(20);    // currently highest number
        calc.addValue(4);     // currently lowester number
        calc.addValue(16);

        // add other integers
        calc.addValue(2);
        calc.addValue(5);
        calc.addValue(160);

        // output lowest number
        System.out.println("lowest number: " + calc.getMinimum());

        // output highest number
        System.out.println("highest number: " + calc.getMaximum());

        // output sum of all numbers
        System.out.print("sum of all numbers: " + calc.sum());
    }
}
