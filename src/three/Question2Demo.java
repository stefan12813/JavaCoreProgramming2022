package three;

import javax.swing.*;
import java.util.Scanner;

public class Question2Demo {
    public static void main(String[] args) {
        System.out.println("Unesi tekstualni cijeli broj");
        String text = JOptionPane.showInputDialog("Unesi tekst");
        int number = Integer.parseInt(text);
        System.out.println(number);
    }
}
