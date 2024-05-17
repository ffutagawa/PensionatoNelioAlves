package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Principal {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent [] vect = new Rent[10];

		System.out.print("Quantos quartos irão ter?: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.print("Rent: " + i + ":");
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("E-mail: ");
			String email = sc.next();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Rent(nome, email);		
		}
		System.out.println();
		System.out.println("Quartos Alocados");
		for(int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
				
			}
		}
		sc.close();
		
	}
}
