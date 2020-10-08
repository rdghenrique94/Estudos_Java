package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.Conta;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Conta> listContas = new ArrayList<>();
		
		System.out.println("Infor das Contas ");	
		Conta ac = new Conta(0, 0);
		System.out.println("Informe o Número e Saldo da Conta: ");
		ac.setConta(sc.nextInt());
		ac.setSaldo(sc.nextDouble());
		System.out.println("Informe o Número e Saldo de Outra Conta: ");
		Conta ac1 = new Conta(0, 0);
		ac1.setConta(sc.nextInt());
		ac1.setSaldo(sc.nextDouble());
		
		listContas.add(ac);
		listContas.add(ac1);
		
			if (ac.getSaldo() > ac1.getSaldo()) {
				System.out.println("Saldo da Conta " + ac.getConta() + " é maior " + ac.getSaldo());
			}
			else {
				System.out.println("Saldo da Conta " + ac1.getConta() + " é maior " + ac.getSaldo());
			}
			

		
		
		/*for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Cliente #"+(i+1)+":");
			System.out.println("Numero da Conta: ");
			Integer conta = sc.nextInt();
			System.out.print("Saldo: ");
			Double saldo = sc.nextDouble();
			
			Conta cont = new Conta(conta, saldo);
			list.add(cont);
		
		System.out.println();
		Collections.sort(listContas, (Conta cont, Pessoa pessoa2)
				   -> pessoa1.getIdade().compareTo(pessoa2.getIdade()));
				   listPessoas.forEach(p -> System.out.println(p.getNome()));*/		
		sc.close();
		}
		
		}


