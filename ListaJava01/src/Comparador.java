import java.util.Scanner;

public class Comparador {
	private int a;
	private int b;
	private int c;

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

	public int getMaior(int a, int b, int c) {
		if(a >= b) {
            if(a >= c)
                return a;
            else
                return c;
        } else {
            if(b >= c)
                return b;
            else
                return c;
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("insira o primeiro numero");
		Comparador comparador = new Comparador();
		comparador.setA(reader.nextInt());
		System.out.println("insira o segundo numero");
		comparador.setB(reader.nextInt());
		System.out.println("insira o terceiro numero");
		comparador.setC(reader.nextInt());
		System.out.println("o maior numero eh: "+ comparador.getMaior(comparador.getA(),comparador.getB(),comparador.getC()));
		reader.close();
	}

}
