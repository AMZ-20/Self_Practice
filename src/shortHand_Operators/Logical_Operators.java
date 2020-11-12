package shortHand_Operators;

public class Logical_Operators {
    public static void main(String[] args) {
      boolean r1 = 10<9 || 20 != 20;
        System.out.println(r1);
        boolean r2 ="Muhtar" == "Good Guy" || "Muhtar" != "Bad Guy";
        System.out.println(r2);
        boolean r3 = 'a' != 'A' || 'B' == 'B';
        System.out.println(r3);

        // && and Logic mostly false expression,Return true only if all expressions true.
        boolean r4 = 200 > 100 && 200<300;
        System.out.println(r4);
        boolean r5 = true && false;
        System.out.println(r5);
      System.out.println("======================");

      System.out.println("========================");
      String name1= "Courtney";
      int age1 = 18;
      boolean isEligible = true;
      boolean can = isEligible == false && age1 >= 21;
      System.out.println("Courtney can buy Alcohol: "+can);
      System.out.println();
      String Name = "Eda";
      boolean Drive = true;
      int age = 15;
      boolean CrmRcd = false;
      boolean CanDrive= Drive == false && age >= 17 && CrmRcd == true;
      System.out.println("Is Eda can drive legally?: "+CanDrive);
      System.out.println();
      String name2 = "Allison";
      boolean isCtz = true;
      boolean CrmBgd= true;
      boolean DrgTest= true;
      boolean isPassed = isCtz == true && CrmBgd == true && DrgTest == true;
      System.out.println("Is Allison passed the Background Test: "+isPassed);
      System.out.println();
      String car ="BMW M4";
      int speed = 185;
      double Accelerate = 0.380;
      boolean over = true;
      boolean Acclt= false;
      boolean handle = Acclt == false &&  Accelerate >= 0.310 && over== false;
      System.out.println("is Bmw M4 can go over 200MPH: "+handle);









    }
}
