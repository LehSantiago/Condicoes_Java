package exercicio03;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[10];
		int soma = 0;
			
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Informe um valor para a %d° posição:", i +1);
			vetor[i] = sc.nextInt();
			soma += vetor[i];
		}
		System.out.print("\nEntrada:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
			
		}
		System.out.println("\nSoma dos valores" + soma);
		
		sc.close();
	}

}
