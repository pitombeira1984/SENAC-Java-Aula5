package testandoAlerta;

import javax.swing.JOptionPane;

public class Tela {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("Digite um Texto");
		
		Alerta alerta = new Alerta(texto);
		
		alerta.mostraAlerta();

	}

}
