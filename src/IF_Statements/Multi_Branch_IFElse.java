package IF_Statements;

public class Multi_Branch_IFElse {
    public static void main(String[] args) {
        int n1= 100;
        int n2= 200;
        int n3= 300;

        if(n1>n2&&n1>n3){
            System.out.println("n1 is bigger"); // Multi_Branch_If
        }else if(n2>n1&&n2>n3){
            System.out.println("n2 is bigger");
        }else{
            System.out.println("n3 is bigger");
        }
        System.out.println();

        String Numbers =(n1>n2&&n1>n3) ? "n1 is bigger" :(n2>n1&&n2>n3)? "n2 is bigger" : "n3 is bigger";// Ternary
        System.out.println(Numbers);

        System.out.println("================================================");
        int day = 0;

        if(day==1){
            System.out.println("It's a Monday");
        }else if(day==2){
            System.out.println("It's a Tuesday");
        }else if(day == 3){
            System.out.println("It's a Wednesday");
        }else if(day==4){
            System.out.println("It's a Thursday");
        }else if(day==5){
            System.out.println("It's a Friday");
        }else if(day==6){
            System.out.println("It's a Saturday");
        }else if (day==7){
            System.out.println("It's a Sunday");
        }else{
            System.out.println("There is no such a day!");
        }
        System.out.println("*****************************");

        String days = (day==1)?"It's a Monday":(day ==2)?"It's a Tuesday":(day==3)?"It's a Wednesday":(day==4)? "It's a Thursday" :(day==5)?"It's a Friday":(day==6)?"It's a Saturday":(day==7)?"It's a Sunday":"There is no such a day!";
        System.out.println(days);
    }
}
