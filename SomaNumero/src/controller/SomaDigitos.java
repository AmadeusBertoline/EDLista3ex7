package controller;

public class SomaDigitos {
	// Função recursiva para calcular a soma dos dígitos de um número
	public static int somaDigitos(int n) {
		// Caso base: se n for menor que 10, retorna o próprio número
		if (n < 10) {
			return n;
		}
		// Chamada recursiva: último dígito + soma dos dígitos restantes
		return (n % 10) + somaDigitos(n / 10);
	}
}
