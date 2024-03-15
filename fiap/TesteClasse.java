package br.com.fiap;

public class TesteClasse {

	public static void main(String[] args) {
		
//		Televisor tv = new Televisor();
//		tv.volume = 8;
//		tv.canal = 13;
//		tv.mostrar();
//		tv.trocarCanal(5);
//		tv.diminuirVolume();
//		tv.diminuirVolume();
//		tv.mostrar();
//		
//		ArCondicionado ac = new ArCondicionado();
//		ac.temperatura = 19;
//		ac.modo = "Resfriamento";
//		ac.aumentarTemperatura();
//		ac.aumentarTemperatura();
//		ac.mostrar();
	
		FolhaDePagamento folha = new FolhaDePagamento();
		folha.descontoINSS = 27;
		folha.numeroDeDependentes = 2;
		folha.salarioBruto = 7257.98;
		folha.valorPlanoDeSaude = 1700;
		folha.calcularSalarioLiquido();
		folha.mostrar();
	}
	
	

}
