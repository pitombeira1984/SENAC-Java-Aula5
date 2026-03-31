package testandoAlerta;

import javax.swing.JOptionPane;

public class Alerta {

	private String msg;
	
	public Alerta(String msg) {
		this.msg = msg;
	}
	
	public void mostraAlerta() {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void mostraErro() {
		JOptionPane.showMessageDialog(null, msg, "ERRO", 1);
	}

}
