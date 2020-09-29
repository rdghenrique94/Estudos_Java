package view;

import java.util.Locale;
import java.util.Scanner;
import model.Funcionario;
import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int menu;
		//Menu de Interação com o programa. 
		do {
		menu = Integer.parseInt(JOptionPane.showInputDialog("MENU: \n"
				+ "1-Cadastrar Funcionario\n"
				+ "2-Aumentar Salario dos Funcionarios\n"
				+ "3-Demitir Funcionario\n"
				+ "4-Sair"));	
		
        Funcionario[] cadFuncionario = {
        		new Funcionario(100, 1, 200.00, 365897, true),
        		new Funcionario(90, 2, 250.00, 658971, true),		
        };
        //Função Cadastrar Funcionario
        if (1==menu) {
        	JOptionPane.showMessageDialog(null, "Cadastre Dois Funcionarios,"
    				+ " um Terceiro Entrará por Arrumadinho");
        	JOptionPane.showMessageDialog(null, "Informações dos Funcionarios");
        	for (int i=0; i < cadFuncionario.length; i++ ) {
        		JOptionPane.showMessageDialog(null, "ID: " + cadFuncionario[i].getId() + 
        				" ID do Setor: " + cadFuncionario[i].getIdSetor() +
        				" Salario: " + cadFuncionario[i].getSalario() +
        				" RG: " + cadFuncionario[i].getRg());
}
        	Funcionario[] novoFuncionario = new Funcionario[5];
        	for (int i=0; i < cadFuncionario.length; i++) {
        		novoFuncionario[i] = cadFuncionario[i];
        	
        	int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID"));
        	int idSetor = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Setor"));
        	int salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o Salario"));
        	int rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o RG"));
        	
			novoFuncionario[2] = new Funcionario(30, 30, 250.00, 123456, true);
        	novoFuncionario[3] = new Funcionario(id, idSetor, salario, rg, true);        	
        	novoFuncionario[4] = new Funcionario(id, idSetor, salario, rg, true);  
        	}        	
        	JOptionPane.showMessageDialog(null, "Todos os Funcionarios: ");        	
        	for (int i=0; i < novoFuncionario.length; i++) {
        		JOptionPane.showMessageDialog(null,"ID: " + novoFuncionario[i].getId() + 
        				" ID do Setor: " + novoFuncionario[i].getIdSetor() +
        				" Salario: " + novoFuncionario[i].getSalario() +
        				" RG: " + novoFuncionario[i].getRg());
        	} 
        //Função Aumentar Salario	
        }else if(2==menu) {        	
        	JOptionPane.showMessageDialog(null, "Novo Salario dos Funcionarios"); 
        	Funcionario[] novoSalario = new Funcionario[2];
        	for (int i=0; i < novoSalario.length; i++) {        		
        		novoSalario[i] = cadFuncionario[i];
        		novoSalario[i].aumentarSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor Bonus no Salario ")));
        		JOptionPane.showMessageDialog(null, "Novo Salario: " + novoSalario[i].getSalario());
        	
        		}
        //Função Demitir		
        }else if (3==menu) {
        	JOptionPane.showMessageDialog(null, "Demitindo Funcionario");
        	Funcionario[] demite = new Funcionario[2];
        	for (int i=0; i < 2; i++) {
        		demite[i] = cadFuncionario[i];    		
        	    demite[i].demitir();
        	    JOptionPane.showMessageDialog(null, "Mudando a Tag: " + demite[i].isEmpregado());
        	    }
        		JOptionPane.showMessageDialog(null, "Funcionarios Demitidos");
        	
        //Saida do programa	
        }else {
        	JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO OBRIGADO");
        	
        }
        
        sc.close();
   	} while (menu != 4); 	   
}
}
