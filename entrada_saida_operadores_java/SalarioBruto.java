/* Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador, em variáveis do tipo float e exiba na tela o Salário Líquido. */


package entrada_saida_operadores_java;

import java.util.Scanner;

public class SalarioBruto {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nSalário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\nAdicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\nHoras Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("\nDescontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + horasExtras*5 - descontos;
		
		System.out.println("\nSalário Líquido: " + salarioLiquido);
		
		leia.close();		
		
	}

}
