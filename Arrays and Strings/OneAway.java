

//There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. 
//Given two strings, write a function to check if they are one edit away.

// Brute force solution is by testing the insertion, deletion and removal of each strings.
public class OneAway { 
public static boolean oneEditAway(String first, String second) {
    if(first.length() == second.length()) {
        return replace(first, second);
    }
    else if(first.length() + 1 == second.length()){
        return insert(first, second);
    }
    else if(first.length() - 1 == second.length()) {
        return insert(second, first);
    }
    return false;
}
static boolean replace(String s1, String s2) {
    boolean difference = false;
    for(int i=0; i<s1.length(); i++){
        if(s1.charAt(i) != s2.charAt(i)) {
            if(difference) {
                return false;
            }
            difference = true;
        }
    }
    return false;
}
    static boolean insert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while(index2 < s2.length() && index1 < s1.length()) {
            if(s1.charAt(index1) != s2.charAt(index2)) {
                if(index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }
}