package IF_Statements;

public class NestedIF_EligibleTOvote {
    public static void main(String[] args) {
        String citizen = "USA";
        int age = 15;

        if(citizen=="USA"){ //Pre-Condition. Required and order for Nested IF Statements
          if(age>18){
              System.out.println("You are eligible to Vote.");
          }else{
              System.out.println("You must be at least 18 years old to Vote.");
          }
            }else  {
            System.out.println("You must be a US Citizen to Vote");
        }
        String Vote =(citizen=="USA")?"You are eligible to Vote" :(age>18)?"You must be at least 18 years old to Vote"
                :"You must be a US citizen to Vote";
        System.out.println(Vote);
        }
    }

