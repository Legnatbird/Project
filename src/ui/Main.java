package ui;

import java.util.GregorianCalendar;
import java.util.Scanner;
import model.Controller;

public class Main {
	/*
	 * This class is the main class of the program. It is in charge of the interaction with the user.
	 */
	private Scanner reader;
	GregorianCalendar search;
	private Controller controller;

	/*
	 * This method is the constructor of the class
	 */
	public Main() {

		reader = new Scanner(System.in);
		controller = new Controller();
	}

	/*
	 * This method is the main method of the program
	 */
	public static void main(String[] args) {

		Main exe = new Main();
		exe.menu();

	}

	/*
	 * This method is in charge of showing the menu and calling the methods of the controller class
	 */
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
				controller.RegisterProject();
				break;
			case 2:
				System.out.println("Enter the date");
				search = controller.generateDate();
				controller.searchProjectsAfterDate(search);
				break;
			case 3:
				System.out.println("Enter the date");
				search = controller.generateDate();
				controller.searchProjectsBeforeDate(search);
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
}
