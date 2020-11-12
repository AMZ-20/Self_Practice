package Arrays;

import java.util.*;

public class Arrays_ReverseSentence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String sentence= input.nextLine();

        String reversed="";
        String[] words=sentence.split(" ");

        for(int i=words.length-1; i>=0; i--){
            if(i>0){
                reversed+=words[i]+" ";
            }else{
                reversed+=words[i];
            }

        }
        System.out.println("reversed = " + reversed);
    }
}
