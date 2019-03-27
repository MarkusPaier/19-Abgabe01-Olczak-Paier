import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final List<Integer> list = new ArrayList<Integer>();

        Calculator calc = new Calculator() {
            public int getMaximum() {
               return 0;
            }

            public int getMinimum() {
                return 0;
            }

            public void addValue(int value) {
                list.add(value);
            }
        };

        calc.addValue(20);    // currently highest number
        calc.addValue(4);     // currently lowester number
        calc.addValue(16);

        // add other integers

        // output lowest number

        // output highest number

        // output sum of all numbers
    }
}
