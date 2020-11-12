package IF_Statements;
/*
    2. write a program that can define the age groups of a person
                       Age groups are:
     infant (< 1 year)          Young Adult (18 - 20),
     Toddler (3 - 5),           Adult (21 - 39),
     Kid (6 - 9),               Young Middle-Aged Adult (40 - 49),
     Pre-Teen (10 - 12),        Middle-Aged Adult (50 - 54),
     Teenager (13 - 17),        Very Young Senior Citizen (55 - 64),
     Senior Citizen (75 - 84),  Old Senior Citizen (85+)
     */
public class Age_Groups2 {
    public static void main(String[] args) {
        int age = 35;
        String ageGroups ="";

        if(age>=2){   // This is Multi Branch IF statement example!!!
            ageGroups ="Infant";
        }else if(age<=5){
            ageGroups="Toddler";
        }else if(age<=9){
            ageGroups="Kid";
        }else if(age<=12){
            ageGroups="Pre-Teen";
        }else if(age<=17){
            ageGroups="Teenager";
        }else if(age<=20){
            ageGroups="Young Adult";
        }else if(age<=39){
            ageGroups="Adults";
        }else if(age<=40){
            ageGroups="Young Middle Age Adults";
        }else if(age<54){
            ageGroups="Middle Age Adults";
        }else if(age<=74){
            ageGroups="Young Senior Citizens";
        }else if(age<=84){
            ageGroups="Senior Citizens";
        }else {
            ageGroups="Old Senior Citizens";
        }
        System.out.println(ageGroups); // Multi_Branch_IF Version.
        System.out.println("=====================");
        String ageGroup =(age<=2)?"Infant" :(age<=5)?"Toddler" :(age<=9)?"Kid" :(age<=12)?"Pre-Teen"
                :(age<=17)?"Teenager" :(age<=20)?"Young Adult" :(age<=39)?"Adult" :(age<=55)?"Middle Age Adult"
                :(age<=70)?"Young Senior Citizen" :(age<84)?"Senior Citizen" : "Old Senior Citizen";
        System.out.println(ageGroup); // Ternary Version.
    }
}
