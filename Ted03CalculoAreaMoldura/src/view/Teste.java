package view;

import java.util.Scanner;
import model.Rectangle;
import model.Frame;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
        System.out.println("Enter base value");
        double base = sc.nextDouble();
        System.out.println("Enter height value");
        double height = sc.nextDouble();
        System.out.println("Enter width value");
        double width = sc.nextDouble();
       

        Rectangle r1 = new Rectangle(base, height);
        Frame f1 = new Frame(r1, width);

      
		System.out.println("The Frame area is: " + f1.calcArea() + "Cm²");
        sc.close();
    }

}
