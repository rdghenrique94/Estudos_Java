package view;

import model.Livro;
import model.Publicacao;
import model.Revista;

public class Teste {
    
	
	public static void main(String args[]) {
		
		Publicacao pub = new Publicacao("A Cabana", " Maio de 2007", " Sextane ");
		
		Livro liv = new Livro("A Cabana", " Maio de 2007", " Sextane ", " 9788599296363" );
		Revista rev = new Revista("A Cabana", " Maio de 2007", " Sextane ", " 1 mes");
		
                System.out.println(pub);
                System.out.println();
		System.out.println(liv);
                System.out.println();
		System.out.println(rev);
                
                
                
                
		

		
		
	}

}

