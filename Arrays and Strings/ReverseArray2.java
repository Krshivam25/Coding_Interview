// In this solution we have to Reverse an array without affecting the special character and symbols like (!,@,#,$,%,^,&,*) etc.
// Time complexity of an algorithm is O(n)
// Space Complexityh is O(1).
// Example : Input Array = Ab,c,de,!$
//           Output Array = ed,c,bA,!$
public class ReverseArray2 {
    public static void reverse(char str[]) {
        int left = 0, right = str.length-1;

        // Check for the Non Alphabetic character from both end
        while(left < right) {
            if(!Character.isAlphabetic(str[left])){
                left++;
            }
            else if(!Character.isAlphabetic(str[right])){
                right--;
            }
            else {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }

        }
    }
    public static void main(String[]args) {
        String str = "Ab,c,de!$";
        char[] charArray = str.toCharArray();

        System.out.println("Input String: " +str);
        reverse(charArray);
        String revstr = new String(charArray);
        System.out.println("Output String: " +revstr);
    }

    
}
