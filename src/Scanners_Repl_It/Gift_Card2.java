package Scanners_Repl_It;

import java.util.Scanner;

public class Gift_Card2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String item =input.nextLine();
        int price =0;
        int giftCard=100;

        switch (item){
            case"Iphone":
                price=300;
                break;
            case"Laptop":
                price=500;
                break;
            case"Charger":
                price=30;
                break;
            case"USB Cable":
                price=15;
                break;
            case"HeadPhones":
                price=30;
                break;
            case"Pants":
                price=50;
                break;
            case "Socks":
                price=10;
                break;
            case "Hat":
                price=25;
                break;
            case "Blanket":
                price=60;
                break;
            case "Pillow":
                price=30;
                break;
            default:
                System.out.println("Invalid Item");
        }
       if(price<=100&&price>=0){
           int balance =giftCard-price;
           System.out.println("Thank you for your purchase,Please see us again\nYour balance after this purchase is: "+balance+"$");
       }else if(price>=100){
           System.out.println("Sorry,Not enough funds you broke ass Motherfucker!!!!");
       }

    }
}
