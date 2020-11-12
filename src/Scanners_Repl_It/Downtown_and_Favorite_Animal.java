package Scanners_Repl_It;

import java.util.Scanner;

public class Downtown_and_Favorite_Animal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What city do you live in");
        input.nextLine();
        String city = input.nextLine();

        System.out.println("Do you live in downtown");
        String liveDownTown = input.next();
        if(liveDownTown.equalsIgnoreCase("yes")) {
            System.out.println("Have you thought about moving to the suburbs");
            String suburb = input.next();
            if(suburb.equalsIgnoreCase("yes")) {
                System.out.println("You should its great");
            } else {
                System.out.println("You should think about it");
            }
        }

        System.out.println("what is your favorite animal");
        String animal = input.next();
        System.out.println("Wow, " + animal + " is a great animal");

        System.out.println("How many pets do you want");
        int pets = input.nextInt();
        System.out.println("Interesting, do you want " + pets + " " + animal + "s" );
    }
}
