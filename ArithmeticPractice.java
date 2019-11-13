public class ArithmeticPractice {

    public static void main(String[] args) {
        // part 2
        for (double n = 1; n <= 126; n += 5) {
            System.out.println(n + "    " + Math.pow(n, 2) + "    " + Math.sqrt(n) + "    " + Math.pow(n, 3) + "    " + Math.cbrt(n));
        }
        System.out.println(dist(5, 8, 3, 4));
    }

    // part 3
    public static double dist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(((x1 - x2)*(x1-x2)+ (y1 - y2)*(y1-y2)));
    }

}
