package Arrays;

import java.util.*;
/*
Instructions from your teacher:
Given the array words, it will print the word with the largest length.
 Assume that there are no 2 words with longest length
Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */

public class Arrays_FindingMaxLength {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] words=new String[5];
        for(int i=0; i<=5; i++){
            words[i]= input.nextLine();
        }
        String longestWord=words[0];

        for(String each:words){
            if(each.length()>longestWord.length()){
                longestWord=each;
            }
        }
        System.out.println(longestWord);
    }
}
