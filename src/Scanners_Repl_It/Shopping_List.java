package Scanners_Repl_It;

import java.util.Scanner;

public class Shopping_List {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Please enter item 1 and it's price");
        String item1=scan.nextLine();
        double price1=scan.nextDouble();

        System.out.println("Please enter item2 and it's price");
        String item2=scan.nextLine();
        scan.nextLine();
        double price2=scan.nextDouble();



        System.out.println("Please enter item3 and it's price");
        String item3=scan.nextLine();
        scan.nextLine();
        double price3=scan.nextDouble();



        double totalCost=(price1+price2+price3);

        scan.close();

        String result="Item1:"+ item1 + " Price: $" + price1 +", " +"Item 2: "+ "Cucumbers " +  "Price $" + price2+ ", " + "Item3 " + "Feta Cheese " + "Price: $" + price3;
        System.out.println(result);
        System.out.println("Total Cost: $"+totalCost);


    }
}
