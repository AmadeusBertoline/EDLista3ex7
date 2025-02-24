package view;

import controller.SomaDigitos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();
        
        int resultado = SomaDigitos.somaDigitos(numero);
        System.out.println("A soma dos dígitos é: " + resultado);
    }
}
