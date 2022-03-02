public class Mortgage {

    public static double pow(double pow, double b) {
        double result = 1;
        for (int i = 0; i < pow; i++) {
            result *= b;
        }
        return result;
    }

    public static double getMonthlyPayment(double u, double b, double p) {
        p *= 12;
        b /= (100 * 12);
        return u * (b * pow(p, 1 + b)) / (pow(p, 1 + b) - 1);
    }
}
