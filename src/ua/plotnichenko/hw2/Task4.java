package ua.plotnichenko.hw2;

public class Task4 {
    public static void main(String[] args) {
        int first = 15;
        int second = -7;
        int third = 33;
        printMinAbsValue(first, second, third);
    }
    private static void printMinAbsValue(int first, int second, int third) {
        int firstAbs = first > 0 ? first : -first;
        int secondAbs = second > 0 ? second : -second;
        int thirdAbs = third > 0 ? third : -third;
        int min = Math.min(thirdAbs, Math.min(firstAbs, secondAbs));
     min = getNumberFromMinModule(first, second, third, firstAbs, secondAbs, min);
        System.out.printf("Minimum absolute value from init data [%d, %d, %d] is %d", first, second, third, min);
    }
    private static int getNumberFromMinModule( int first, int second, int third, int firstAbs, int secondAbs, int min){
    if (min == firstAbs){
        min = first;
    } else if (min == secondAbs) {
        min = second;
    } else {
        min = third;
    }
    return min;
}
}