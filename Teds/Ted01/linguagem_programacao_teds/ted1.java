package linguagem_programacao_teds;

import java.util.Scanner;

import temp_class.Salario_Bruto;

public class ted1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Salario_Bruto salario = new Salario_Bruto();
		
		System.out.println("Enter Hours Value and Hours Works: ");
		System.out.print("Hours Value: ");
		salario.hourValue = sc.nextDouble();
		System.out.println();
		System.out.print("Hours Works: ");
		salario.hourWork = sc.nextDouble();
		System.out.println();
		System.out.printf("Gross Salary %.2f%n ",salario.calcSalario());
		System.out.printf("Salary discount IR %.2f%n",salario.calcIr());
		System.out.printf("Salary discount IN %.2f%n",salario.calcIn());
		System.out.printf("Salary discount SI %.2f%n",salario.calcSn());
		
		
		sc.close();
	}

}
