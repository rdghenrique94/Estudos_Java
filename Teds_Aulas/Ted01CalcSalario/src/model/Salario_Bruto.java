package model;

public class Salario_Bruto {
	
	public double hourValue;
	public double hourWork;
	
	public double calcSalario() {
		return hourValue * hourWork;
	}
	public double calcIr() {
		return calcSalario() * 0.11;
	}
	public double calcIn() {
		return calcSalario() * 0.08;
}
	public double calcSn() {
		return calcSalario() * 0.05;
}
}