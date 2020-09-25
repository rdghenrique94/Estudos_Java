package linguagem_programacao_teds;

import java.util.Scanner;

import temp_class.Rectangle;

public class Teste {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter External Rectangle width and height: ");
        double widht = sc.nextDouble();
        double height = sc.nextDouble();
        
        System.out.println("Enter Internal Rectangle width and height: ");
        double widht1 = sc.nextDouble();
        double height1 = sc.nextDouble();

        rect.setWidht(widht);
        rect.setHeight(height);
        
        rect.setWidhtf(widht1);
        rect.setHeightf(height1);

        System.out.println("External Area Rectangle: " + rect.areaEx() +" Cm²");
        System.out.println("Internal Arena Rectangle: " + rect.areaIn() +" Cm²");
         
        System.out.println("Frame Arena: "+ rect.frame()+" Cm²");
        sc.close();
    }

}
