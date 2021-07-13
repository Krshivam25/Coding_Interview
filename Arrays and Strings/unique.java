// Implement an algorithm to determine if a string has all unique characters. what If you cannot use additional Data structure?

// Solution 1: To check whether a string is matched or not character by character

public class unique {
    public static boolean isUnique(String text) {
        int size = text.length();
    
        for(int i=0; i<size-1; i++) {
            char select = text.charAt(i);
    
            for(int j=i+1; j<size; j++) {
                if(select == text.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    //The main method will be same for all the solution.
    public static void main(String[] args) {
      System.out.println(isUnique("hello"));
      System.out.println(isUnique("world"));
    }
}

// Time Complexity: String having n number of characters, the outer loop iterates n-1 times. The inner loop iterates n-2 times for the first time.
// n-2 for the second time and n-3 for the third times.
// T(n) = O(n-1) + O(n-2) + O(n-3) + ... + 2 + 1
//      = O(n-1) * O(n)/2
//      = O(n^2)


// Solution 2 : Using an Sorting Algorithm that can sort of array of characters in less than O(n^2)

public static boolean isUnique(String text) {
    char[] words = text.toCharArray();
    Arrays.sort(words); // Use import java.util.Arrays;
    int size = words.length-1;
    for(int i=0; i<size; i++) {
        if(words[i] == words[i+1]) {
            return false;
        }
    }
    return true;
}

//Time Complexity : 
// T(n) = O(nlog(n)) + O(n)
//      = O(nlog(n))


