/* Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule e mostre a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4. */

package entrada_saida_operadores_java;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número:");
		n1 = leia.nextFloat();
		
		System.out.println("\nEntre com o segundo número:");
		n2 = leia.nextFloat();
		
		System.out.println("\nEntre com o terceiro número:");
		n3 = leia.nextFloat();
		
		System.out.println("\nEntre com o quarto número:");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2)-(n3 * n4);
		
		System.out.println("\nA diferença do produto entre o primeiro e segundo número pelo produto entre o terceiro e o quarto número é: "+ diferenca);
		
		leia.close();

	}

}
