package estrutura_condicional;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exercicio: Fazer um programa para ler um n�mero inteiro, 
		// e depois dizer se este n�mero � negativo ou n�o
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}

		sc.close();
	}

}
