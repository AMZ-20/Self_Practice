package Scanners_Repl_It;

import java.util.Scanner;

public class BurgerORchicken {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String in = s.next();

        double price=10.0;
        double price2=2.0;
        if(in.equals("burger") || in.equals("chicken")){
            System.out.println(price);
        }else if(in.equals("soda")){
            System.out.println(price2);
        }
    }
}
