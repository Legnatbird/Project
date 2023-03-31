package model;

import java.util.GregorianCalendar;
import java.io.Console;

/*
 * This class is in charge of managing the projects
 */
public class Controller {

	private Project[] projects;
	private int projectCounter;
	private Console console = System.console();

	/*
	 * This method is the constructor of the class
	 */
	public Controller() {
		projects = new Project[10];
	}

	/*
	 * This method is in charge of generating a date
	 * 
	 * @return GregorianCalendar
	 */
	public GregorianCalendar generateDate() {
		int year = Integer.parseInt(console.readLine("Enter year: "));
		int month = Integer.parseInt(console.readLine("Enter month: "));
		int day = Integer.parseInt(console.readLine("Enter day: "));

		return new GregorianCalendar(year, month, day);
	}

	/*
	 * This method is in charge of registering a project
	 */
	public void RegisterProject() {
		if (projectCounter < 10) {
			String name = console.readLine("Enter project name: ");
			String clientName = console.readLine("Enter client name: ");
			System.out.println("Enter start date");
			GregorianCalendar startDate = generateDate();
			System.out.println("Enter end date");
			GregorianCalendar endDate = generateDate();
			double budget = Double.parseDouble(console.readLine("Enter budget: "));
			projects[projectCounter] = new Project(name, clientName, startDate, endDate, budget);
			projectCounter++;
		}
	}

	/*
	 * This method is in charge of searching projects after a date
	 * 
	 * @param date
	 */
	public void searchProjectsAfterDate(GregorianCalendar date) {
		for (int i = 0; i < projects.length; i++) {
			if ((projects[i] != null) && (projects[i].getStartDate().after(date))) {
				System.out.println("Project found" + projects[i].getName());
			}
		}
	}

	/*
	 * This method is in charge of searching projects before a date
	 * 
	 * @param date
	 */
	public void searchProjectsBeforeDate(GregorianCalendar date) {
		for (int i = 0; i < projects.length; i++) {
			if ((projects[i] != null) && (projects[i].getStartDate().before(date))) {
				System.out.println("Project found" + projects[i].getName());
			}
		}
	}
}
