class nFraction {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(a % b, b);
    }

    public static void product(int n, int num[], int den[]) {
        int new_num = 1, new_den = 1;
        for (int i = 0; i < n; i++) {
            new_num *= num[i];
            new_den *= num[i];
        }
        int GCD = gcd(new_num, new_den);
        new_num /= GCD;
        new_den /= GCD;

        System.out.println(new_num + "/" + new_den);
    }
}