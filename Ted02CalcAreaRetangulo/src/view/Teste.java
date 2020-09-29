package view;

import model.Rectangle;
import java.util.Scanner;

public class Teste {
	
public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter rectangle width and height: ");
        double widht = sc.nextDouble();
        double height = sc.nextDouble();

        rect.setWidht(widht);
        rect.setHeight(height);

        System.out.println("Area Rectangle: " + rect.area());
       
        sc.close();
    }
}
