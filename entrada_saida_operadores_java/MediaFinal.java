/* Elabore um algoritmo em Java que leia 4 notas de um participante, em variáveis do tipo float e exiba na tela a média final do participante. */

package entrada_saida_operadores_java;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("\nEntre com a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Média final: "+media);
		
		leia.close();

	}

}
