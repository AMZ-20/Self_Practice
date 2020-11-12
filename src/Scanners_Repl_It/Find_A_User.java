package Scanners_Repl_It;

import java.util.Scanner;

public class Find_A_User {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Enter full name: ");
        String user =scan.nextLine();

        if (user.equals("Max Payne")||user.equals("Alain Wake")){
            System.out.println("User found! "+"\""+user+"\"");
        }else{
            System.out.println("User not found!");
        }
    }
}
