package IF_Statements;

public class NestedIF_GradeReport {
    public static void main(String[] args) {
        int score =75;
        String grade ="";   // Nested If and Ternary mixed!!!

        if( score>=0 && score<=100){ // Condition between 0-100.
            grade=(score>=90)?"A" :(score>=80)?"B" :(score>=70)?"C" :(score>=60)?"D" : "F";

        }else{
            grade="Invalid";
        }
        System.out.println(grade);
    }
}
