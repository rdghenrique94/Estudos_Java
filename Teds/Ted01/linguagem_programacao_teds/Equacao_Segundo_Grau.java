package linguagem_programacao_teds;

public class Equacao_Segundo_Grau {

	public static void main(String[] args) {
		int a = 1;
		int b = -2;
		int c = -3;
		double delta;
		double x1;
		double x2;

		delta = (b^b) - 4*a*c; 

		x1 = (-b + (Math.sqrt((b^b) - 4 * a * c))) / (2 * a);

		x2 = (-b - (Math.sqrt((b^b) - 4 * a * c))) / (2 * a); 

		System.out.printf("Valor de x1: %.2f%n",x1);
		System.out.printf("Valor de x2: %.2f%n",x2);
		System.out.printf("Valor de Delta: %.2f%n",delta);

	}

}
