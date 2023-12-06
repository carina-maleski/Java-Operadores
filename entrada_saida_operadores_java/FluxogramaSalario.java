package entrada_saida_operadores_java;

import java.util.Scanner;

public class FluxogramaSalario {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nDigite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("\nO novo salário é: " + novoSalario);
		
		leia.close();
		
	}

}
