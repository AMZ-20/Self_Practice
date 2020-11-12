package Scanners_Repl_It;

import java.util.Scanner;

public class Citizens_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the count of Senior and Non Senior Citizens");
        int seniorCitizens=input.nextInt();
        int nonSeniors =input.nextInt();

        System.out.println("Please enter new citizens age");
        byte age =input.nextByte();
        byte age2=input.nextByte();
        byte age3= input.nextByte();




        if(age>=65){
            seniorCitizens +=3;
            System.out.println("A New Senior Citizen Welcome your new Home");
            System.out.println("Updated Senior Citizens count "+seniorCitizens);
            System.out.println("Updated Non Senior Citizens count "+nonSeniors);
        }else{
            nonSeniors +=3;
            System.out.println("A New non Senior Citizen Welcome your new Home");
            System.out.println("Updated Senior Citizens count "+seniorCitizens);
            System.out.println("Updated Non Senior Citizens count "+nonSeniors);
        }



    }
}
