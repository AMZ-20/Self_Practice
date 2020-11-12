package IF_Statements;

public class NestedIFstatements_Daysinaweek {
    public static void main(String[] args) {
        int number = 0;
        String day = "";

        if(number>=1&&number<=7) { // Pre Condition for Nested IF Statement
            if (number == 1) {
                day = "\"Monday\"";
            } else if (number == 2) {
                day = "Tuesday";
            } else if (number == 3) {
                day = "Wednesday";
            } else if (number == 4) {
                day = "\"Thursday\"";
            } else if (number == 5) {
                day = "\"Friday\"";
            } else if (number == 6) {
                day = "Saturday";
            } else if(number==7)
                day = "Sunday";
            }else{
                day="No such a day!";
            }
        System.out.println(day);
        System.out.println("======================");

        String days=(number==1)?"Monday" :(number==2)?"Tuesday" :(number==3)?"Wednesday" :(number==4)?"Thursday" :(number==5)?"Friday"
                :(number==6)?"Saturday" :(number==7)?"Sunday" : "\"no such a day.\"";
        System.out.println(days);
        }


    }

