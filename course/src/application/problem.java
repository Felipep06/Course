package application;

import java.util.Locale;
import java.util.Scanner;

import entities.triangle;

public class problem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		triangle x, y;
		x = new triangle();
		y = new triangle();
		
		System.out.println("Enter the measures of triangule X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		x.d = sc.nextDouble();
		System.out.println("Enter the measures of triangule Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c= sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X área: %.4f%n" , areaX);
		System.out.printf("Triangle Y área: %.4f%n" , areaY);
		
		if(areaX > areaY) {
			System.out.println("Langer area X");
		}else {
			System.out.println("Langer area Y");
		}
		
		sc.close();
	}

}
