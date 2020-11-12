package Scanners_Repl_It;

import java.util.Scanner;

public class Vehicle_Recall2 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);



        System.out.println("Enter your vehicle year");
        int vehYear = scan.nextInt();

        System.out.println("Enter your vehicles model");
        String model=scan.next();

        if(vehYear>=1995&&vehYear<=1999||vehYear>=2001&&vehYear<=2002||vehYear>=2004||vehYear<=2006||vehYear>=2015&&vehYear<=2018){
            System.out.println("Your vehicle needs to be recalled!");
            if(model=="Corolla"||model=="Camry"||model=="Avalon"||model=="Yaris"){
                System.out.println("Your vehicle has a good alternator!");
            }else{
                System.out.println("Your vehicle needs a alternator replacement");
            }
            }else{
            System.out.println("Your Vehicle still good,Enjoy Driving!");
        }

    }
}
