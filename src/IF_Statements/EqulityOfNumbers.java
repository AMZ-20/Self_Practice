package IF_Statements;

public class EqulityOfNumbers {
    public static void main(String[] args) {

        int n1 =100;
        int n2 =200;
        int n3 =300;

        String result =" ";

        if(n1== n2 && n1==n3){ // Regular IF Statement.
            result ="all equal";
        }else if(n1==n2){
            result ="n1 and n2 is equal";
        }else if(n1==n3){
            result="\"n1 & n3 is equal.\"";
        }else{
            result="None of them are equal";
        }
        System.out.println(result);
        System.out.println();
        String results =(n1==n2&&n1==n3)?"all equal" :(n1==n2)?"n1 and n2 is equal" :(n1==n3)? "n1 and n3 are equal" : "\"None of them are Equal.\"";
        // Ternary Version of IF Statement.
        System.out.println(results);
        System.err.println("=========================");
        System.err.println("\"Java is getting harder \"I\" hate this IF statements\"");
    }
}
