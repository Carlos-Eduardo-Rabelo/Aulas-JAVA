package br.com.fiap;

public class TesteFolhaDePagamento {

	public static void main(String[] args) {

		FolhaDePagamento folha = new FolhaDePagamento();
		folha.descontoINSS = System.in("Coloque o desconto do INSS");
		folha.numeroDeDependentes = 2;
		folha.salarioBruto = 7257.98;
		folha.valorPlanoDeSaude = 700;
		folha.calcularSalarioLiquido();
		folha.mostrar();
	}
	
	

}
