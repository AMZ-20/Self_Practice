package Variables;

public class Relational_Operators {
    public static void main(String[] args) {
        System.out.println(10<100);
        System.out.println(10 >= 8);
        System.out.println(9 >= 9);
        System.out.println( 10 <= 10);
        System.out.println(10 <= 5);
        System.out.println("=============");
        // == Equal Operator

        int a1 = 20;
        int a2 = 30;
        int a3 = 30;
        System.out.println( a3 == a2);

        char ch1 = '!';
        char  ch2 = '!';
        System.out.println(ch1 == ch2);

        String language = "Turkish";
        String language2 = "Indian";
        String language3 = "Turkish";
        System.out.println( language == language2);
        System.out.println( language == language3);

        System.out.println("Russian" == " English ");

        System.out.println("=======================");
        // != Not Equal Operator
        System.out.println("Russian Language"!= "Japanese Language");
        System.out.println( 20 != 20);
        System.out.println('a' != 'A');


    }
}
