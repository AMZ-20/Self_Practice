package IF_Statements;

public class Nested_NameOfTheMonths {
    public static void main(String[] args) {

        int n =2;
        String month="";

        if(n>=1&&n<=12){  // Nested If and Ternary used together.
            month =(n==1)?"Jan" :(n==2)?"Feb" :(n==3)?"March" :(n==4)?"April" :(n==5)?"May" :(n==6)?"June"
                    :(n==7)?"July" :(n==8)? "Aug" :(n==9)?"Sep" :(n==10)?"Oct" :(n==11)?"November" : "December";

        }else{
            month ="No such a Month";
        }
        System.out.println(month);

    }
}

