package model;

import java.util.GregorianCalendar;
import java.io.Console;

public class Controller {

	private Project[] projects;
	private Console console;

	public Controller() {
		projects = new Project[10];
	}

	public GregorianCalendar generateDate() {
		int year = Integer.parseInt(console.readLine("Enter year: "));
		int month = Integer.parseInt(console.readLine("Enter month: "));
		int day = Integer.parseInt(console.readLine("Enter day: "));

		return new GregorianCalendar(year, month, day);
	}
	
	//Incomplete
	public boolean RegisterProject() {
		if (projects.length < 10) {
			String name = console.readLine("Enter project name: ");
			String clientName = console.readLine("Enter client name: ");
			GregorianCalendar startDate = generateDate();
			GregorianCalendar endDate = generateDate();
			double budget = Double.parseDouble(console.readLine("Enter budget: "));
			projects[projects.length] = new Project(name, clientName, startDate, endDate, budget);
			return true;
		}
		return false;
	}

	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsAfterDate(GregorianCalendar date) {
		String msg = "";
		for (int i = 0; i < projects.length; i++) {
			if (projects[i].getStartDate().after(date)) {
				msg = projects[i].toString();
			}
		}
		return msg;

	}
	
	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsBeforeDate(GregorianCalendar date) {
		String msg = "";
		for (int i = 0; i < projects.length; i++) {
			if (projects[i].getStartDate().before(date)) {
				msg = projects[i].toString();
			}
		}
		return msg;
	}
}
