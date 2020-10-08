package model;

public class Conta {
	
	private int conta;
	private double saldo;
	public Conta(int conta, double saldo) {
		this.conta = conta;
		this.saldo = saldo;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
	

