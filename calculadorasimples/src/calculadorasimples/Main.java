package calculadorasimples;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quer saber se pode votar? digite a sua idade.");
		
		int idade ;
		
		idade = sc.nextInt();
		
		if (idade >= 16) {
			System.out.printf("Sua idade é " + idade + " e você pode votar.");
		}
		
		else {
			System.out.printf("Sua idade é "+ idade +" e você não pode votar.");
		}
		
		sc.close();


	}

}
