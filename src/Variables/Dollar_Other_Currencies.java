package Variables;

public class Dollar_Other_Currencies {
    public static void main(String[] args) {

        int dollar = 1000;
        double lira =dollar*0.13;
        double rubble=dollar*75.27;
        double JPY=dollar*111.50;
        double MEXP=dollar*22.50;
        double riyal=dollar*3.45;
        double EGYP =dollar*15.78;
        double rand =dollar*18.45;
        double naira=dollar*380.24;
        double yuan =dollar*6.85;
        double PHP = dollar*48.35;
        double BTC = dollar/10750.00;
        double euro = dollar*0.89;
        String equal="Equal to: $";
        System.out.println(equal+"\""+lira+"\""+" Turkish Liras.\n"+equal+rubble+" Russian Rubbles.\n"+equal+JPY+" Japanese Yens.\n"+equal+MEXP+" Mexican Pesos.\n"+equal+riyal+" Saudi Riyals.\n");
        System.out.println(equal+EGYP+" Egyptian Pounds.\n"+equal+rand+" South African Rands\n"+equal+"\""+naira+"\""+" Nigerian Nairas.\n"+equal+yuan+" Chinese Yuan.\n"+equal+PHP+" Philippino Peso.\n"+equal+"\""+BTC+"\""+"Bitcoins.\n"+equal+euro+"Euros.");


    }
}
