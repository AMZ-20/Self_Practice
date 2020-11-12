package IF_Statements;

public class Nested_IF_Loan {
    public static void main(String[] args) {
        double minimumSalary = 50000;
        int workHistory = 3;
        int creditScore= 550;

        if (minimumSalary >= 30000) {

           if(workHistory>=2){

               if(creditScore>=680){
                   System.out.println("You are qualified for a loan");
               }else{
                   System.out.println("You have to have minimum 680 credit score");
               }

           }else{
               System.out.println("You must have a two years job history");
           }


        }else{
            System.out.println("You must have minimum $30k income");
        }
        System.out.println("===============================");


        }


    }