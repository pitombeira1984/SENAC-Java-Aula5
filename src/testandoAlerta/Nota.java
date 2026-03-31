package testandoAlerta;

public class Nota {
	
	private double n1,n2;
	
	public Nota(double n1,double n2) {
		
		if(n1 < 0 || n2 < 0) {
			Alerta alerta = new Alerta("n1 ou n2 menor que zero");
			alerta.mostraErro();
		}else {
			this.n1 = n1;
			this.n2 = n2;
		}
		
	}
	
	public double calculaMedia() {
		double media = (n1+n2)/2;
		return media;
	}

}
