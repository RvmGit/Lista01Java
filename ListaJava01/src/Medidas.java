import java.util.Scanner;

public class Medidas {
	String unidadeDeDistancia;
	double distancia;
	String unidadeDeMassa;
	double massa;
	String unidadeDeTemperatura;
	double temperatura;
	
	public Medidas() {}
	
	public Medidas(double distancia, String unidadeDeDistancia
			,double massa, String unidadeDeMassa
			,double temperatura, String unidadeDeTemperatura) {
		
		setDistancia(distancia);
		setUnidadeDeDistancia(unidadeDeDistancia);
		setMassa(massa);
		setUnidadeDeMassa(unidadeDeMassa);
		setTemperatura(temperatura);
		setUnidadeDeTemperatura(unidadeDeTemperatura);
	}
	
	public String getUnidadeDeDistancia() {
		return unidadeDeDistancia;
	}
	public void setUnidadeDeDistancia(String unidadeDeDistancia) {
		this.unidadeDeDistancia = unidadeDeDistancia;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public String getUnidadeDeMassa() {
		return unidadeDeMassa;
	}
	public void setUnidadeDeMassa(String unidadeDeMassa) {
		this.unidadeDeMassa = unidadeDeMassa;
	}
	public double getMassa() {
		return massa;
	}
	public void setMassa(double massa) {
		this.massa = massa;
	}
	public String getUnidadeDeTemperatura() {
		return unidadeDeTemperatura;
	}
	public void setUnidadeDeTemperatura(String unidadeDeTemperatura) {
		this.unidadeDeTemperatura = unidadeDeTemperatura;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		Medidas medidas = new Medidas();
		


	}

}
