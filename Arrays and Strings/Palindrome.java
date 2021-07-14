//Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.The palindrome does not need to be limited to just dictionary words. You can ignore casing and non-letter characters.
// EXAMPLE
// Input: Tact Coa
// Output: True (permutations: “taco cat”. “atco cta”. etc.)

import java.util.HashMap;

class Palindrome {
    public boolean isPalidrome(String str) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        int oddCounts = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (((int) str.charAt(i)) < ((int) 'a') || (int) str.charAt(i) > ((int) 'z'))
                continue;

            charCount.put(ch, (charCount.get(ch) == null ? 0 : charCount.get(ch) + 1));

            if (charCount.get(ch) % 2 == 1) {
                oddCounts++;
            } else {
                oddCounts--;
            }
        }
        return (oddCounts <= 1);
    }
}
class Test {
    public static void main(String[] args) {

        Palindrome pd = new Palindrome();

        System.out.println(pd.isPalidrome("taco caT"));
        System.out.println(pd.isPalidrome("taco cat"));

    }
}