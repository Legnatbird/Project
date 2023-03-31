package ui;

import java.util.GregorianCalendar;
import java.util.Scanner;
import model.Controller;

public class Main{

	private Scanner reader;
	private Controller controller;
	private int day, month, year;

	public Main() {

		reader = new Scanner(System.in);
		controller = new Controller();
	}

	public static void main(String[] args) {

		Main exe = new Main();
		exe.menu();

	}

	// Incomplete
	public void menu() {
		int option = 0;

		do {
			System.out.println("1. Register project");
			System.out.println("2. Search projects after date");
			System.out.println("3. Search projects before date");
			System.out.println("4. Exit");

			option = reader.nextInt();

			switch (option) {
			case 1:
				if (controller.RegisterProject()) {
					System.out.println("Project registered");
				} else {
					System.out.println("Project not registered");
				}
				break;
			case 2:
				System.out.println("Enter the date");
				System.out.println("Year: ");
				year = reader.nextInt();
				System.out.println("Month: ");
				month = reader.nextInt();
				System.out.println("Day: ");
				controller.searchProjectsAfterDate(new GregorianCalendar(year, month, day));
				break;
			case 3:
				System.out.println("Enter the date");
				System.out.println("Year: ");
				year = reader.nextInt();
				System.out.println("Month: ");
				month = reader.nextInt();
				System.out.println("Day: ");
				day = reader.nextInt();
				controller.searchProjectsBeforeDate(new GregorianCalendar(year, month, day));
				break;
			case 4:
				System.out.println("Bye");
				break;
			default:
				System.out.println("Invalid option");
				break;
			}

		} while (option != 4);
	}

	//Incomplete
	public void RegisterProject() {

	}

	//Incomplete
	public void searchProjectsAfterDate() {

	}
	
	//Incomplete
	public void searchProjectsBeforeDate() {

	}
}
