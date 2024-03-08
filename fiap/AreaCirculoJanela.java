package br.com.fiap;

import javax.swing.JOptionPane;

public class AreaCirculoJanela {

	public static void main(String[] args) {
		
		int raio = 0;
		String auxiliar;
		try {
			auxiliar = JOptionPane.showInputDialog("Digite o raio");
			raio = Integer.parseInt(auxiliar);
			JOptionPane.showMessageDialog(null, "A área do círculo é: " 
			+ ((raio * raio) * 3.14) + " m²");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de número incorreto");
		}
		
	}

}
