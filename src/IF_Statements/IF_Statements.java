package IF_Statements;

public class IF_Statements {
    public static void main(String[] args) {
        int score = 70;

        if (score >= 60) {
            System.out.println("Congrats");
        }
        if (score < 60){
            System.out.println("Keep Trying");
        }
        System.out.println("=====================");
        if(score >= 60){
            System.out.println("Congrats");
        }else{
            System.out.println("Keep Trying");

            String Score =(score >= 60)? "Congrats" : "Keep Trying"; // Ternary.
            System.out.println(Score);
        }
        System.out.println("======================");
        int angle1 = 80;
        int angle2 = 75;
        int angle3 = 65;
        int angle4 = 75;

        boolean isValidRectangle = angle1 == 90 && angle2 == 90 && angle3 == 90 && angle4 == 90;
        // if each of the angles are equal to 90,Then it's valid
        /*
        if(isValidRectangle){
            System.out.println("It is valid rectangle");
        }
        if(!isValidRectangle){
            System.out.println("It is NOT valid rectangle");
        }
         */
        if(isValidRectangle){
            System.out.println("The rectangle is valid");
        }else{
            System.out.println("The rectangle is Not valid");
        }
        }

    }