package ua.plotnichenko.hw10;

public class Task2 {
    public static void main(String[] args) {
        Pow power = (number, pow) -> {
            int resultOfCalculationNumberToPow = 1;
            for (int i = 0; i < pow; i++) {
                resultOfCalculationNumberToPow *= number;
            }
            return resultOfCalculationNumberToPow;
        };
        System.out.println(power.calculate(3, 3));
    }
}

interface Pow {
    int calculate(int number, int pow);
}

