import java.util.Scanner;

public class Estatistica {
	int maiorValor;
	
	public int getMaiorValor() {
		return maiorValor;
	}
	public void setMaiorValor(int maiorValor) {
		this.maiorValor = maiorValor;
	}

	public Estatistica(int numero) {
		this.maiorValor = numero;
		
	}
	
	public int somatorio (int n) {
		int total=0;
		for(int count=1;count<=n;count++) {
			total = total+count;
			
		}
		
		return(total);
	}
	
	public float media(int n) {
		float total =0;
		int count =0;
		do {
			total = total+count;
			count++;
		}while(count <=n);
		return(total/count);
	}
	
	public double variancia(int n) {
		Estatistica estatistica = new Estatistica(n);
		double varia=0;
		int count=0;
		if(n==1) {
			return(n);
		}else {
	        float media = estatistica.media(n);
	        while(count<=n) {
	            varia += Math.pow(count - media, 2);
	            count++;
	        }

	        return Math.sqrt(varia/n-1);
		}
	}
	
	public void paresImpares(int n) {
		for(int count=0;count<=n;count++) {
			if ((count % 2) == 0) {
			    System.out.println(count+" é par");
			}
			else {
			    System.out.println(count+" é impar");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("determine o Maior Valor");
		Estatistica estatistica = new Estatistica(reader.nextInt());
		System.out.println("somatorio dos numeros entre zero e maior valor = "
				+ estatistica.somatorio(estatistica.maiorValor));
		System.out.println("media entre zero e maior valor = "
				+ estatistica.media(estatistica.maiorValor));
		System.out.println("variancia entre zero e maior valor = "
				+ estatistica.variancia(estatistica.maiorValor));
		estatistica.paresImpares(estatistica.maiorValor);
	}

}
