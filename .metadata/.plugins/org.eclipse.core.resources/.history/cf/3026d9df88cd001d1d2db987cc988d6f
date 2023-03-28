package Atividade;
import java.util.Scanner;


public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int fibonacciAtual = 0;

        while (fibonacciAtual < numero) {
            fibonacciAtual = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacciAtual;
        }

        if (fibonacciAtual == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}



