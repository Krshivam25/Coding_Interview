//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
// n is the power and x is the number
// n can be any number positive or negative
// Time complexity: O(n)
// Space Complexity: O(1)
public class XPowerN {
    public double power(double x, int n){
        double ans = 1.0;
        long nn = n;
        if(nn < 0) nn = -1 * nn;
        while(nn > 0){
            if(nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            }
            else{
                x = x * x;
                nn = nn / 2;
            }
        }
        if(n < 0) ans = (double)(1.0) / (double) (ans);
        return ans;
      
    }
}
