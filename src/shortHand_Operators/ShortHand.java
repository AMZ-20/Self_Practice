package shortHand_Operators;

public class ShortHand {
    public static void main(String[] args) {
        int a =100;// = assignment Operator
        System.out.println(a);
        System.out.println(++a);
        a = 200;
        System.out.println(a);
        System.out.println(++a);
        a =300;
        System.out.println(a);
        System.out.println(--a);

        String name = "Daniel";
        System.out.println(name);
        name = "John";
        System.out.println(name);
        System.out.println("=====================");
        // += Adition Assignment
        int A = 200;
        // A = A + 100;
             A += 100; //+= Adition Assignment
        System.out.println(A);

        String school = "\"Cybertek";
           // school + " School";  //Concatenation Assignment
              school += " School\""; //+= Adition Assignment
        System.out.println(school);
        System.out.println();
        int savingAccount = 1000;
            savingAccount += 2000;
        System.out.println("$"+savingAccount);
            savingAccount += 500;
        System.out.println("$"+savingAccount);
        System.out.println("===================");

        // -= Subtraction Operator
             savingAccount -= 1000;
        System.out.println("$"+savingAccount);
        System.out.println("================");

        // *= MultiPlication Assingment
        double salary = 100000.5;
               salary *= 1.2;
        System.out.println(salary);
        int Y = 10;
        Y *= 10;
        System.out.println(Y);
        // /= Division Assignment.

        double tax = 10000;
        tax /= 2;
        System.out.println("$"+tax);
        System.out.println("==============");
        // %= Remainder Assignment (What you have left after Dividing)
        int T = 100;
            T %=10;
        System.out.println(T);
        double U =35;
               U %= 9;
        System.out.println(U);
        }


    }

