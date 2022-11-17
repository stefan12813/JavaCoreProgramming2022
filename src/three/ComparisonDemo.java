package three;

import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Uneis drugi broj: ");
        int number2 = new Scanner(System.in).nextInt();
        boolean comparisonResult = number1 == number2;
        if (number1 == number2){
            System.out.println("Hej pa unio si jednake brojeve");
        }
        if (number1 != number2){
            System.out.println("Unio si nejednake brojeve");
        }
        if(number1>number2){
            System.out.println("Broj prvi je veci od drugog broja");
        }
        if(number1>=number2){
            System.out.println("Prvi broj je veci ili jednak od drugog broja");
        }
    }
}
