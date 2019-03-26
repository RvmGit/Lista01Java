import java.util.Scanner;


public class ComparadorDeStrings {

	public boolean reverso(String a, String b) {
			if(a.length()==b.length()) {
				for(int i = 0; i < ((a.length())/2); i++)
				{
					if(a.charAt(i)!=b.charAt(b.length()-1-i)) {
						return false;
					}
				}
		return true;	
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparadorDeStrings comparadorDeStrings = new ComparadorDeStrings();
		Scanner reader = new Scanner(System.in);
		System.out.println("primeira palavra");
		String a = reader.nextLine();
		System.out.println("segunda palavra");
		String b = reader.nextLine();
		System.out.println(comparadorDeStrings.reverso(a, b));
		
	}

}
