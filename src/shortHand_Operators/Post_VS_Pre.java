package shortHand_Operators;

public class Post_VS_Pre {
    public static void main(String[] args) {
        int x = 7;
        System.out.println( ++x); //Pre Increament
        System.out.println(x);    // It's change the Value Immediately

        System.out.println(--x); //Pre Decreament
        System.out.println(x);
        System.out.println("========================");

        double y = 7;
        System.out.println(y++); // Post Increament
        System.out.println(y);// It changes the Value after posting current Value.

        System.out.println(y--); // Post Decreament
        System.out.println(y);  // It changes the Value after posting current Value.

        int t1= 100;
        System.out.println(++t1 - --t1 + t1++ - t1--);
        System.out.println(t1);
        double wax = 400.57;
        System.out.println(wax * ++wax + --wax * wax++);
        System.out.println(wax);
        double max = 205.65;
        System.out.println( ++max + --max + ++max + --max);
        System.out.println(max);
        int rock = 1000;
        System.out.println(rock++ + --rock);
        System.out.println(rock);
        double height = 12.5;
        System.out.println(++height);
        System.out.println(height--);
        System.out.println(height--);
        System.out.println(--height);
        System.out.println(height++);
        System.out.println(height);
        int length = 8;
        System.out.println(length++);
        System.out.println(length);
        System.out.println(length--);
        System.out.println(length);
        System.out.println(++length);
        System.out.println(--length);
        double eth = 350.55;
        int  Eth =(int)eth;
        System.out.println(++eth );



        }

    }

