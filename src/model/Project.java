package model;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.text.ParseException;


public class Project{
	
	private String name;
	private String clientName;
	private Calendar initialDate;
	private Calendar finalDate;
	private double budget;

	private DateFormat formatter;
	/*
	 * This method is the constructor of the class
	 * @param name: name of the project
	 * @param clientName: name of the client
	 * @param initialDate: initial date of the project
	 * @param finalDate: final date of the project
	 * @param budget: budget of the project
	 */
	public Project(String name, String clientName, Calendar initialDate, Calendar finalDate, double budget){
		
		this.formatter = new SimpleDateFormat("dd/M/yy");

		this.name = name;	
		this.clientName = clientName;
		this.initialDate = initialDate;
		this.finalDate = finalDate;
		this.budget = budget;
	}
	/*
	 * This method is in charge of getting the name of the project
	 * @return String
	 */
	public String getName(){
		return name;
	}
	/*
	 * This method is in charge of getting the name of the client
	 * @return String
	 */
	public String getClientName(){
		return clientName;
	}
	/*
	 * This method is in charge of getting the initial date of the project
	 * @return GregorianCalendar
	 */
	public GregorianCalendar getStartDate(){
		return (GregorianCalendar) initialDate;
	}
	/*
	 * This method is in charge of getting the final date of the project
	 * @return GregorianCalendar
	 */
	public Calendar getInitialDate(){
		return initialDate;
	}
	/*
	 * This method is in charge of getting the initial date of the project
	 * @return String
	 */
	public String getInitialDateFormated() throws ParseException{
		return formatter.format(this.initialDate.getTime());
	}
	/*
	 * This method is in charge of getting the final date of the project
	 * @return String
	 */
	public Calendar getFinalDate(){
		return finalDate;
	}
	/*
	 * This method is in charge of getting the final date of the project
	 * @return String
	 */
	public String getFinalDateFormated() throws ParseException{
		return formatter.format(this.finalDate.getTime());
	}		
	/*
	 * This method is in charge of getting the budget of the project
	 * @return double
	 */
	public double getBudget(){
		return budget;
	}
	/*
	 * This method is in charge of getting the information of the project
	 * @return String
	 */
	public String getProjectInfo() throws ParseException{
		return "\nName: " + name + "\nClient: " + clientName + "\nInitial Date: " + getInitialDateFormated() + 
		"\nFinal Date: " + getFinalDateFormated() + "\nTotalBudget: " + budget + ".\n";
	}
}


