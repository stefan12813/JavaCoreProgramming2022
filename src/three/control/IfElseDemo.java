package three.control;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        System.out.println("Profa unesite broj poena na ispitu");
        int brojBodova = new Scanner(System.in).nextInt();
        char ocjena;
        if(brojBodova>= 90){
            ocjena = 'A';
        } else if (brojBodova >= 80) {
            ocjena = 'B';
        } else if (brojBodova>= 70) {
            ocjena = 'C';
        } else if (brojBodova>= 60) {
          ocjena ='D';
        }else {
            ocjena = 'F';
        }
        System.out.println("Ocjena za unesesni broj poena = " + ocjena);
    }
}
