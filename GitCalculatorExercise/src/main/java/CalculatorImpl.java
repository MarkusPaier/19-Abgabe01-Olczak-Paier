import java.util.ArrayList;
import java.util.List;

public class CalculatorImpl implements Calculator {
    List<Integer> list = new ArrayList<Integer>();

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
        return result;
    }
}

