package com.chocolate_rain.ui;

import java.util.Scanner;

public class ManagerTerminalUI {
	
	private static final int NUMBER_LEN = 9;
	private static final int CODE_LEN = 6;

	private static String mainMenu = "Manager Terminal\n"
			+ "\n1. Create Record"
			+ "\n2. Update Record"
			+ "\n3. Request Report"
			+ "\n4. Request Provider Dir"
			+ "\n5. Update Provider Dir"
			+ "\n6. Exit";
	
	private static String typePrompt = "Select report/record type"
			+ "\n1. Member"
			+ "\n2. Provider";
	
	private static String numberPrompt = "Enter identifaction number";
	private static String namePrompt = "Enter name";
	private static String addressPrompt = "Enter address";
	private static String cityPrompt = "Enter city";
	private static String statePrompt = "Enter state";
	private static String zipPrompt = "Enter zip";
	private static String serviceCodePrompt = "Enter service code";
	private static String serviceNamePrompt = "Enter service name";
	private static String servicePricePrompt = "Enter service price";
	private static String selectionPrompt = "Enter selection";
	private static String selectionErr = "Invalid selection";
	
	private static String recordUpdateMenu = "Select a field to modify"
			+ "\n1. Name"
			+ "\n2. Number"
			+ "\n3. Address"
			+ "\n4. City"
			+ "\n5. State"
			+ "\n6. Zip";
	
	private static String providerDirectoryUpdateMenu = "Select a field to modify"
			+ "\n1. Service code"
			+ "\n2. Service name"
			+ "\n3. Service price";
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			String input;
			int option = 0;
			
			System.out.println(mainMenu);
			System.out.println(selectionPrompt);
			input = stdIn.next();
			
			//validate the option
			try{
				option = Integer.parseInt(input);
			} catch (NumberFormatException e){
				System.out.println(selectionErr);
				continue;
			}
			
			switch(option){
			case 1:
				//TODO create record
				break;
			case 2: 
				//TODO update record
				int updateOption;
				break;
			case 3:
				//TODO request report
				break;
			case 4:
				//TODO request provider dir
				break;
			case 5:
				//TODO update provider dir
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println(selectionErr);
				continue;
			}
			
			
		}
	
	}

}
