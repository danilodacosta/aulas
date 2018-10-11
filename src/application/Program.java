package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Department;
import entites.Worker;
import entites.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter department's name: ");
		
		String departamentName = sc.nextLine();
		System.out.print("Enter Worker data:");
		
		System.out.print("Name:");
		String workName = sc.nextLine();
		System.out.print("Level:");
		String workLevel = sc.nextLine();
		System.out.print("Base salary :");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workName,WorkerLevel.valueOf(workLevel), baseSalary, new Department(departamentName));
		
		
		
		sc.close();
	}

}
