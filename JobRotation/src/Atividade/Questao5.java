package Atividade;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = input.nextLine();

        String invertedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertedStr += str.charAt(i);
        }

        System.out.println("String invertida: " + invertedStr);
    }
}
