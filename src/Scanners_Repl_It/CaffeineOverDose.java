package Scanners_Repl_It;

import java.util.Scanner;

public class CaffeineOverDose {

    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of milligrams in the Drink");
        int numOfmg = input.nextInt();

        int overDose = 1000*10;
        int drinks =overDose/numOfmg;
        System.out.println("It would take about "+drinks+" drinks for a lethal overdose");
    }
}
