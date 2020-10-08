package view;

import model.Rectangle;
import java.util.Scanner;

public class Teste {
	
public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter rectangle base and height: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        rect.setBase(base);
        rect.setHeight(height);

        System.out.println("Area Rectangle: " + rect.area());
       
        sc.close();
    }
}
