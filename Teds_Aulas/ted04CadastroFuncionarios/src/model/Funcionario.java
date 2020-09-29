package model;

public class Funcionario {

	private int id;
	private int idSetor;
	private double salario;
	private int rg;
	private boolean empregado;
	
	public Funcionario() {}
	
	public Funcionario(int id, int idSetor, double salario, int rg, boolean empregado) {
		this.id = id;
		this.idSetor = idSetor;
		this.salario = salario;
		this.rg = rg;
		this.empregado = true;
	}
	public Funcionario(int id, int idSetor, double salario, int rg) {
		this.id = id;
		this.idSetor = idSetor;
		this.salario = salario;
		this.rg = rg;
		this.empregado = true;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdSetor() {
		return this.idSetor;
	}

	public void setIdSetor(int idSetor) {
		this.idSetor = idSetor;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getRg() {
		return this.rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public boolean isEmpregado() {
		return this.empregado;
	}

	public void setEmpregado(boolean empregado) {
		this.empregado = empregado;
	}
	public void aumentarSalario(Double aumento) {
		setSalario(getSalario() + aumento);
	}
	
	public void demitir() {
		this.empregado = !this.empregado;	
	}
	
	
}
