// Implement a method to perform basic string compression using the counts of repeated characters. 
// For example, the string aabccccaaa would become a2b1c5a3.


public class StringCompression { 
   public static String compression(String str) {
       if(str.length() == 0){
           return str;
       }
       StringBuilder sb = new StringBuilder(str.length() + 1);
       char currChar = str.charAt(0);
       int currCount = 1;
       for(int i=1; i<str.length(); i++) {
           if(str.charAt(i) == currChar) {
               currCount++;
           }
           else {
               sb.append(currChar);
               sb.append(currCount);
               if(sb.length() > str.length()) {
                   return str;
               }
               currChar = str.charAt(i);
               currCount = 1;

           }
       }
       sb.append(currChar);
       sb.append(currCount);
       return sb.toString();
   }
 public static void main(String[] args) {
     System.out.println(compression("aabbccddeef"));
 }      
}