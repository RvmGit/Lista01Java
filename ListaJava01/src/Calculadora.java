
import java.util.Scanner;

public class Calculadora {
	public float getPrimeiroParametro() {
		return primeiroParametro;
	}

	public void setPrimeiroParametro(float primeiroParametro) {
		this.primeiroParametro = primeiroParametro;
	}

	public float getSegundoParametro() {
		return segundoParametro;
	}

	public void setSegundoParametro(float segundoParametro) {
		this.segundoParametro = segundoParametro;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public float primeiroParametro;
	public float segundoParametro;
	public String operacao;

	public static float soma(float x, float y)
	{
		float somatorio = x+y;
		return somatorio;
	}
	
	public static float subt(float x, float y)
	{
		float somatorio = x-y;
		return somatorio;
	}

	public static float multi(float x, float y)
	{
		float somatorio = x*y;
		return somatorio;
	}

	public static float div(float x, float y)
	{
		float somatorio = x/y;
		return somatorio;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("insira o primeiro numero");
		float x = reader.nextFloat();
		System.out.println("qual operacao sera feita?");
		String op = reader.next();
		System.out.println("insira o segundo numero");
		float y = reader.nextFloat();
		
		System.out.printf("a operacao foi: " + x+" " + op+" "+y+" = ");
		switch(op) {
		case "+":
			System.out.println(soma(x,y));
			break;
		case "-":
			System.out.println(subt(x,y));
			break;
		case "*":
			System.out.println(multi(x,y));
			break;
		case "/":
			System.out.println(div(x,y));
			break;
			default:
				System.out.println("\n operacao invalida");
		}
		
		reader.close();
	}
}