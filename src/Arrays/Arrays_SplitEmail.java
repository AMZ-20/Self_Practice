package Arrays;

import java.util.*;
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:
invalid email

email -> my@fancy@email.com
print:
invalid email
 */
public class Arrays_SplitEmail {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String email= input.nextLine();

        String[] arr=email.split("@");
        if(arr.length==2){
            System.out.println("Email id: "+arr[0]);
            System.out.println("Email Domain: "+arr[1]);
        }else{
            System.out.println("Invalid email");
        }
    }
}
