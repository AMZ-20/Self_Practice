package Scanners_Repl_It;

import java.util.Scanner;

public class Gift_Card {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String item= scan.nextLine();
        int gc= 100;
        int price=0;
        if(item.equals("Charger"))
            price=15;
        if(item.equals("USB cable"))
            price=10;
        if(item.equals("Headphones"))
            price=30;
        if(item.equals("Pants"))
            price=50;
        if(item.equals("Socks"))
            price=5;
        if(item.equals("Blanket"))
            price=60;
        if(item.equals("Pillow"))
            price=40;
        if(item.equals("Hat"))
            price=25;

        int balance= gc-price;

        if (item.equals("Smartphone") || item.equals("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else if(item.equals("Charger")|| item.equals("USB cable")||
                item.equals("Headphones")|| item.equals("Pants")|| item.equals("Hat")
                || item.equals("Socks")|| item.equals("Blanket")||item.equals("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance);
        }
        else {
            System.out.println("Invalid item!");
        }
          /*
           Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase. If item is not in the list, display message: "Invalid item!". If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items

           */

    }
}
