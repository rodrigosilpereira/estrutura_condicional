import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int hora = 0;
		
		System.out.println("Quantas Horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
			
		} else if (hora > 12 && (hora < 18)){
			System.out.println("Boa tarde!");
			
		} else {
			System.out.println("Boa noite!");
		}
		
		sc.close();
	}

}
