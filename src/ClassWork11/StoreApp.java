package ClassWork11;

import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) throws BerryException{

        Strawberry s1 = new Strawberry();
        Strawberry s2 = new Strawberry();
        Strawberry s3 = new Strawberry(true, 8);
        Strawberry s4 = new Strawberry();
        Cranberry c1 = new Cranberry();
        Blueberry b1 = new Blueberry();

        s1.setRipe(true);
        s1.setSweetness(5);
        System.out.println(s1);

        System.out.println(s2);
        System.out.println(s3);

        StoreApp helper = new StoreApp();
        helper.setSweetnessToAFruit(s1, -0.5);
        System.out.println(s1);


            }
    void setSweetnessToAFruit(Strawberry obj, double sLevel){
        try {
            obj.setSweetness(sLevel);
        } catch (BerryException bEx) {
            System.out.println("Probably a BerryException has occurred. Try again: ");
            Scanner in = new Scanner(System.in);
            double nextTry = in.nextDouble();
            setSweetnessToAFruit(obj, nextTry);
        }
    }
}
