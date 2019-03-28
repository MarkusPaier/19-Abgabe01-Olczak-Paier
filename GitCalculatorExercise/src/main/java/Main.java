public class Main {

    public static void main(String[] args) {

        Calculator calc = new CalculatorImpl();

        calc.addValue(20);
        calc.addValue(4);
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
