import java.util.Scanner;

public class ConversorDeMedidas {
	public void converterMassa(Medidas medidas1, Medidas medidas2){
		if (medidas1.unidadeDeMassa.equals("kg") && medidas2.unidadeDeMassa.equals("lb")) {
			System.out.println("massa 1 = "+ medidas1.massa*2.2046+" lb \n"+"massa 2 = "
					+ medidas2.massa/2.2046+" kg");
		}else if (medidas1.unidadeDeMassa.equals("lb") && medidas2.unidadeDeMassa.equals("kg")) {
			System.out.println("massa 1 = "+ medidas1.massa/2.2046+" kg \n"+"massa 2 = "
					+ medidas2.massa*2.2046+" lb");
		}else {
			System.out.println("massa invalida");
		}
		
	}
	public void converterDistancia(Medidas medidas1, Medidas medidas2){
		if (medidas1.unidadeDeDistancia.equals("km") && medidas2.unidadeDeDistancia.equals("mi")) {
			System.out.println("distancia 1 = "+ medidas1.distancia/1.609+" mi \n"+"distancia 2 = "
					+ medidas2.distancia*1.609+" km");
		}else if (medidas1.unidadeDeDistancia.equals("mi") && medidas2.unidadeDeDistancia.equals("km")) {
			System.out.println("distancia 1 = "+ medidas1.distancia*1.609+" km \n"+"distancia 2 = "
					+ medidas2.distancia/1.609+" mi");
		}else {
			System.out.println("distancia invalida");
		}
		
	}
	
	public void converterTemperatura(Medidas medidas1, Medidas medidas2) {
		if (medidas1.unidadeDeTemperatura.equals("C") && medidas2.unidadeDeTemperatura.equals("F")) {
			System.out.println("temperatura 1 = "+ ((medidas1.temperatura*1.8)+32) +" F \n"+"temperatura 2 = "
					+ ((medidas2.temperatura-32)/1.8) +" C");
		}else if (medidas1.unidadeDeTemperatura.equals("F") && medidas2.unidadeDeTemperatura.equals("C")) {
			System.out.println("temperatura 1 = "+ ((medidas1.temperatura-32)/1.8) +" C \n"+"temperatura 2 = "
					+ ((medidas2.temperatura*1.8)+32) +" F");
		}else {
			System.out.println("temperatura invalida");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversorDeMedidas conversorDeMedidas = new ConversorDeMedidas();
		Medidas medidas1 = new Medidas (13,"mi",10,"kg",75,"F");
		Medidas medidas2 = new Medidas (5,"km",17,"lb",15,"C");
		System.out.println("comida");
		conversorDeMedidas.converterMassa(medidas1
				,medidas2);
		conversorDeMedidas.converterDistancia(medidas1
				,medidas2);
		conversorDeMedidas.converterTemperatura(medidas1
				,medidas2);
		

	}

}
