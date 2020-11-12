package shortHand_Operators;

public class Practices {
    public static void main(String[] args) {
        System.out.println(100 >= 500);
        System.out.println( 100 <= 200);
        System.out.println(20 >= 10);
        System.out.println(500>=100);
        System.out.println(1000>=5000);
        System.out.println( 5<=10);
        System.out.println(20>=10);
        System.out.println(50>=100);
        System.out.println(80>=800);
        System.out.println(90>=75);
        System.out.println(50<=51);
        System.out.println("\"======\"=======\"=====\"");

        byte r1 = 10;
        byte r2 = 20;
        byte r3 = 10;
        byte r4 = 20;
        System.out.println(r1 == r3);
        System.out.println(r1 == r2);
        System.out.println(r2 == r4);
        System.out.println();
        double t1 = 125.35;
        double t2 = 145.45;
        double t3 = 125.35;
        double t4 = 145.45;
        System.out.println(t1 == t3);
        System.out.println(t2 == t3);
        System.out.println(t2 == t4);
        System.out.println();
        String l1 = "Turkish";
        String l2 = "Greek";
        String l3 = "Russian";
        String l4 = "Kazakh";
        String l5 = "Chinese";
        String l6 = "Azerbaijani";
        String l7 = "Turkish";
        System.out.println(l1 == l2);
        System.out.println( l3 == l4);
        System.out.println(l5 == l7);
        System.out.println(l1 == l7);
        System.out.println();
        char ch1 = 'M';
        char ch2 = 'A';
        char ch3 = 'R';
        char ch4 = 'M';
        System.out.println(ch1 != ch2);
        System.out.println(ch2 == ch3);
        System.out.println(ch1 != ch4);
        System.out.println(ch1 == ch4);
        System.out.println("==================");

        double mySalary = 120000.0;
        mySalary += 20000.0;
        mySalary += 25500.0;
        System.out.println(mySalary);
        System.out.println();
        int salary = 120000;
        int bonus = 20000;
        double stock =25500.0;
        double totalSalary= salary+bonus+stock;
        System.out.println(totalSalary);
        System.out.println();
        double n1 =5000.5;
        int    n2 = (int) 5000.5;
        System.out.println(n2);




    }
}
