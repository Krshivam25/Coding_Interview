// Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional character, and that you are Give with the true length of the string.
// Example :  
// Input: "Mr John Smith  ", 13(this is truelength)
// Output: "Mr%20John%20Smith"

//Approach: We have an character array of some size and we are storing the input string into this.
//Iterate through the array and find how many void spaces are there.
//Identify the index which require to hold new value.

// n is the number of character we need to replace here like %20 have 3 character
// index = trueLength + spaceCount multiply (n-1)
//index = 13 + 2 multiply 2
//index = 17

public class removeSpace {
    public static void replace(char[] str, int trueLength) {
        int spaceCount = 0,index, i=0;
        for(i=0;i<trueLength;i++){
            if(str[i]==' '){
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if(trueLength < str.length) {
            str[trueLength] = '\0';
        }
        for(i=trueLength-1;i>=0;i--) {
            if(str[i] == ' '){
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';
                index = index-3;
            }
            else {
                str[index-1] = str[i];
                index--;
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        replace(str.toCharArray(), str.trim().length());
     
    }


    
}
