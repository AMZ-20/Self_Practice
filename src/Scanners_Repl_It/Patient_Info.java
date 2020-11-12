package Scanners_Repl_It;

import java.util.Scanner;

public class Patient_Info {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.err.println("\"Welcome to \"Oschner\" Metairie Hospital\"");
        System.out.println("Please fill out the form and enter your information");

        System.out.println("Please Enter your first name");
        String firstName=scan.next();

        System.out.println("Please Enter your last name");
        String lastName = scan.next();

        System.out.println("Please enter your e-mail address");
        String email=scan.next();

        scan.nextLine();
        System.out.println("Please enter your street address");
        String address=scan.nextLine();

        System.out.println("Please enter your City");
        String city = scan.nextLine();

        System.out.println("Please enter your State");
        String state =scan.next();

        System.out.println("Please enter your zip code");
        int zip =scan.nextInt();

        System.out.println("Please enter your age ");
        int age = scan.nextInt();

        System.out.println("Please enter your work phone number");
        long workPhone = scan.nextLong();

        System.out.println("Please enter your cell phone number");
        long cellPhone = scan.nextLong();

        System.out.println("Please enter your height");
        double height =scan.nextDouble();

        System.out.println("Please enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married? True or False");
        boolean married =scan.nextBoolean();

        System.out.println("Your name is: "+firstName+" "+lastName+".");
        System.out.println("Your e-mail address is: "+email);
        System.out.println("Your Work Phone Number is: "+workPhone+", "+" Your Cell Phone Number is: "+cellPhone+".");
        System.out.println("Your address is: "+address+", "+city+", "+state+", "+zip+".");
        System.out.println("Your Height: "+height+" ft,"+" Your Weight: "+weight+" lbs.");



    }
}
