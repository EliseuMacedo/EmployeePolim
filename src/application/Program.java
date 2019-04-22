package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		List<Employee> listEmployee = new ArrayList<Employee>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if(ch == 'y' || ch == 'Y') {
			
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				listEmployee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else if(ch == 'n' || ch == 'N') {
				listEmployee.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		System.out.println("\nPAYMENTS:");
		for(Employee x: listEmployee) {
			System.out.println(x);
		}
		sc.close();
	}

}
