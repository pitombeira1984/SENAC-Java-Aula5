package testandoAlerta;

import javax.swing.JOptionPane;

public class EntradaNotas {

	public static void main(String[] args) {
		
		double nota1 = Double.valueOf(JOptionPane.showInputDialog("Insira a Nota1: "));
		double nota2 = Double.valueOf(JOptionPane.showInputDialog("Insira a Nota2: "));
		
		Nota nota = new Nota(nota1,nota2);
		double media = nota.calculaMedia();
		
		Alerta alerta = new Alerta("A média é: " + String.valueOf(media));
		alerta.mostraAlerta();

	}

}
