package three;

import java.util.Scanner;

//System.out.println();
//new Scanner(System.in).nextInt();
public class ArtihmeticDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi cijeli broj:");
        double number1 = new Scanner(System.in).nextDouble();
        System.out.println("Unesi drugi cijeli broj");
        double number2 = new Scanner(System.in).nextDouble();
        //+ addition
        double result = number1+number2;
        System.out.println("Rezultat sabiranja: " + result);
        result = number1 - number2;
        System.out.println("Rezultat oduzimanja " + result);
        result = number1*number2;
        System.out.println("Rezultat mnoyenja " + result);
        result = number1/number2;
        System.out.println("Rezultat dijeljenja:" + result);
        result = number1 % number2;
        System.out.println("Rezultat operatora modulo " + result);
    }
}
