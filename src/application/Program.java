package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		double percentage;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Employee employee = new Employee();
		System.out.println("Entener employee data: ");
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		

		
		System.out.println("Employee: " + employee);
		
		System.out.print("Which percentage to increase salary? ");
		percentage = sc.nextDouble();		
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: " + employee);
		
		sc.close();

	}

}
