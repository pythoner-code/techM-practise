public class Calculator {
    // Static method to calculate power with two integers
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }
    // Static method to calculate power with a double and an integer
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

