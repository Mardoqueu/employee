package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		Employee employee = new Employee();
		System.out.println("Entener employee data: ");
		System.out.print("Name: ");
		employee.name = sc.next();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		

		
		System.out.println("Employee: " + employee.name + ", " + employee.netSalary());
		
		
		sc.close();

	}

}
