public class LCM {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;

        }
        // To calculate the GCD
        return gcd(b % a, a);
    }

    public static int lcm(int a, int b) {
        // To calculate the LCM of num
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        int a = 46, b = 98;
        System.out.println("The LCM of" + a + "and" + b + "is" + lcm(a, b));
    }

}
