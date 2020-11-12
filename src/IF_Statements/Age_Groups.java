package IF_Statements;

public class Age_Groups {
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

    public static void main(String[] args) {

        int age = 20;
        String ageGroups ="";

        if(age>=2 && age<=2){   // This is Multi Branch IF statement example!!!
            ageGroups ="Infant";
        }else if(age>=3&&age<=5){
            ageGroups="Toddler";
        }else if(age>=6&&age<=9){
            ageGroups="Kid";
        }else if(age>=10&&age<=12){
            ageGroups="Pre-Teen";
        }else if(age>=13&&age<=17){
            ageGroups="Teenager";
        }else if(age>=18&&age<=20){
            ageGroups="Young Adult";
        }else if(age>=21&&age<=39){
            ageGroups="Adults";
        }else if(age>40&&age<=40){
            ageGroups="Young Middle Age Adults";
        }else if(age>=50&&age<54){
            ageGroups="Middle Age Adults";
        }else if(age>=55&&age<=74){
            ageGroups="Young Senior Citizens";
        }else if(age>=75&&age<=84){
            ageGroups="Senior Citizens";
        }else {
            ageGroups="Old Senior Citizens";
        }
        System.out.println(ageGroups); // Multi_Branch_IF Version..
        System.out.println("=================");

        String ageGroup=(age>=2 && age<=2)?"Infant" :(age>=3&&age<=5)?"Toddler" :(age>=6&&age<=9)?"Kid" :(age>=10&&age<=12)?"Pre-Teen"
                :(age>=13&&age<=17)?"Teenager" :(age>=18&&age<=20)?"Young Adult":(age>=21&&age<=39)?"Adult" :(age>=40&&age<=54)?"Young Middle Age Adult"
                :(age>=55&&age<=74)?"Middle Age Adults" :(age>=75&&age<=84)?"Senior Citizen" : "Old Senior Citizen";
        System.out.println(ageGroup); // Ternary Version...

        }

    }

