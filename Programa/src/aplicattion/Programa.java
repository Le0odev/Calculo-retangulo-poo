package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Enter rectangle width and height: ");
		System.out.print("Enter the Width: ");
		System.out.println();
		retangulo.width = sc.nextDouble();
		System.out.println("Enter the Height: ");
		retangulo.height = sc.nextDouble();
		System.out.println("Area = " + retangulo.Area());
		System.out.println("Perimeter = " + retangulo.Perimeter());
		System.out.println("Diagonal =  " + retangulo.Diagonal());
		
		sc.close();

	}

}
