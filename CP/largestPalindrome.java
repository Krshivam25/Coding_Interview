// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers or n numbers
public class largestPalindrome {
    // int n = 3;
    // int low = 100;
    // int high = 999;
    public static int largest(int n) {

        int upper = (int) Math.pow(999, n) - 1;
        int low = 1 + upper / 10;
        int max = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= low; j--) {
                int pro = i * j;
                if (pro < max)
                    break;
                int num = pro;
                int rev = 0;
                while (num != 0) {
                    rev = rev * 10 + num / 10;
                    num /= 10;
                }
                if (pro == rev && pro > max)
                    max = pro;

            }
        }

        return max;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(largest(n));

    }

}
