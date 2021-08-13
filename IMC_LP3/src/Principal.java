import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(2);

        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();
        Paciente paciente1 = new Paciente(55, 1.49);
        Paciente paciente2 = new Paciente(44, 1.59);
        Paciente paciente3 = new Paciente(83, 1.63);

        System.out.println("Digite seu Peso em kg");
        paciente.setPeso(sc.nextDouble());
        System.out.println("Digite sua Altura em Metros");
        paciente.setAltura(sc.nextDouble());

        System.out.println("Voce está "  + paciente.diagnostico() + " Seu IMC " + format.format(paciente.calcularIMC()) + " kg/m²");
        System.out.println(" ");
        System.out.println("Paciente 1, " + paciente1.diagnostico() + " IMC: " + format.format(paciente1.calcularIMC()) + " kg/m²");
        System.out.println(" ");
        System.out.println("Paciente 2, " + paciente2.diagnostico() + " IMC: " + format.format(paciente2.calcularIMC()) + " kg/m²");
        System.out.println(" ");
        System.out.println("Paciente 3, " + paciente3.diagnostico() + " IMC: " + format.format(paciente3.calcularIMC()) + " kg/m²");
    }
}
