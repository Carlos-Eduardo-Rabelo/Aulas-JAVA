package br.com.fiap;

public class FolhaDePagamento {
	
	public double salarioBruto;
	public int numeroDeDependentes;
	public double descontoINSS;
	public double valorPlanoDeSaude;
	public double salarioLiquido;
	
	public double calcularSalarioLiquido() {
		salarioLiquido = (salarioBruto- (numeroDeDependentes * valorPlanoDeSaude) - (salarioBruto * descontoINSS));
		return salarioLiquido;
	}
	
	public void mostrar() {
		System.out.println("O salário é: " + salarioLiquido);
	}
	
	
}
