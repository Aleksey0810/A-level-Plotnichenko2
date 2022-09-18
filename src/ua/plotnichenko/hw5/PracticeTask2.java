package ua.plotnichenko.hw5;

public class PracticeTask2 {
    //	Известен рост каждого из 25 учеников класса.
    // Рост мальчиков условно задан отрицательными числами.
    // Определить средний рост мальчиков и средний рост девочек.
    public static void main(String[] args) {
        int[] heights = {120, -125, 135, -145, 150, -152, 112, -175, 123, -125,
                122, -135, 145, -154, 160, -183, 150, -130, 130, -119,
                130, -125, 123, -150, 123};
        System.out.println("girls avg: " + calcGirlsAvgHeight(heights));
        System.out.println("boys avg: " + calcBoysAvgHeight(heights));
    }

    public static double calcBoysAvgHeight(int[] heights) {
        return calc(heights, true);
    }

    public static double calcGirlsAvgHeight(int[] heights) {
        return calc(heights, false);
    }

    public static double calc(int[] heights, boolean isBoy) {
        double sum = 0;
        int amount = 0;
        for (int height : heights) {
            if ((isBoy && height < 0) || (!isBoy && height > 0)) {
                amount++;
                sum += height;
            }
        }
        return Math.abs(sum / amount);
    }
}
