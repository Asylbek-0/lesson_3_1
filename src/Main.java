import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] numbers = {1.7, 3.4, -3.3, 4.8, -2.1, 5.5, 3.2, -1.1, -6.5, 2.6, -3.8, 5.7, 4.3, 7.3, -6.3 };
        double sumPositive = 0.0;
        int countPositive = 0;
        boolean negativeFound = false;

        for (double number: numbers) {
            if (negativeFound) {
                if (number > 0) {
                    sumPositive += number;
                    countPositive++;
                }
            } else if (number < 0) {
                negativeFound = true;
            }
            if(countPositive > 0)
            { double averagePositive  = sumPositive/countPositive;
                System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + averagePositive);

            }
        }
    }
}