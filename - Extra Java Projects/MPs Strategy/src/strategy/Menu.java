package strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	boolean exit;
	
	public static void main(String[] args) 
	{
		Menu menu = new Menu();
		menu.runMenu();
	}
	
	public void runMenu()
	{
	printHeader();
	while(!exit) {
		printMenu();
		int choice = getInput();
		performAction(choice);
	}
	}
	
	private void printHeader()
	{
		System.out.println("+-----------------------------------+");
		System.out.println("|          Welcome to our           |");
		System.out.println("|          Polictican Menu          |");
		System.out.println("+-----------------------------------+");
	}
	
	private void printMenu()
	{
		System.out.println("\nPlease make a selection");
		System.out.println("1) ENTER NEW MP");
		System.out.println("2) DELETE MP");
		System.out.println("3) UPDATE MP");
		System.out.println("4) LIST MPS");
		System.out.println("0) EXIT");
	}
	
	private int getInput()
	{
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		while (choice < 0 || choice > 4)
		{
			try {
				System.out.print("\nEnter your choice");
				choice = Integer.parseInt(kb.nextLine());
			}
			catch(NumberFormatException e){
				System.out.println("\nInvalid selection. Please try again.");
			}
		}
		return choice;
	}
	
	private void performAction(int choice) 
	{
		switch(choice){
		case 0:
			exit = true;
			System.out.println("\nThank you for using our application.");
			break;
		case 1:
			enterMP();
			break;
		case 2: 
			deleteMP();
			break;
		case 3: 
			updateMP();
			break;
		case 4:
			listMP();
			break;
		default: 
			System.out.println("An unknown error has occured.");
		
		}
	}
	
	private void enterMP() 
	{

	}
	
	private void deleteMP() 
	{
		
	}

	private void updateMP() 
	{
	
	}

	private void listMP() 
	{
	
	}
	
}
	
	
	
	


