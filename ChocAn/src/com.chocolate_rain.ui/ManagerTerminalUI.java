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
			+ "\n6. Zip"
			+ "\n7. Exit";
	
	private static String providerDirectoryUpdateMenu = "Select a field to modify"
			+ "\n1. Service code"
			+ "\n2. Service name"
			+ "\n3. Service price"
			+ "\n4. Exit";
	
	//private static RecordFileSystem recordFileSys; TODO
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			String input;
			int option = 0;
			
			System.out.println(mainMenu);
			System.out.println(selectionPrompt);
			input = prompt(selectionPrompt, stdIn, Integer.class);
			
			String input2 = "";
			int option2 = 0;
			switch(option){
			case 1:
				//TODO create record
				
				input2 = stdIn.next();
				break;
			case 2: 
				//TODO update record
				
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
	
	/**
	 * Elicits necessary information to create a new Record for a Member or a Provider.
	 * Calls the RecordFileSystem's createRecord method.
	 * @param scanner
	 * @return
	 */
	public static boolean createRecord(Scanner scanner){
		String type;
		int option;
		String name, number, address, state, city, zip;
		
		type = prompt(typePrompt, scanner, String.class);
		name = prompt(namePrompt, scanner, String.class);
		number = prompt(numberPrompt, scanner, Integer.class);
		address = prompt(addressPrompt, scanner, String.class);
		state = prompt(statePrompt, scanner, String.class);
		city = prompt(cityPrompt, scanner, String.class);
		zip = prompt(zipPrompt, scanner, Integer.class);
		
		if(name == null || number == null || address == null || state == null
				|| city == null || zip == null){
			return false;
		}
		
		//recordFileSys.createRecord(type, new String[]) TODO
		
		return true;
	}
	
	/**
	 * Elicits necessary information to update a Record for a Member or a Provider.
	 * Calls the RecordFileSystem's updateRecord method.
	 * @param scanner
	 * @return
	 */
	public static boolean updateRecord(Scanner scanner){
		String type = prompt(typePrompt, scanner, Integer.class);
		String number = prompt(numberPrompt, scanner, Integer.class);
		int field = Integer.parseInt(prompt(recordUpdateMenu, scanner, Integer.class));
		
		String input;
		switch(field){
		case 1: //name
			input = prompt(namePrompt, scanner, String.class);
			if(input == null){
				return false;
			}
			//recordFileSys.updateRecord(type, number, "name", input); TODO
			break;
		case 2: //number
			input = prompt(numberPrompt, scanner, Integer.class);
			if(input == null){
				return false;
			}
			//recordFileSys.updateRecord(type, number, "number", input); TODO
			break;
		case 3: //address
			input = prompt(addressPrompt, scanner, String.class);
			if(input == null){
				return false;
			}
			//recordFileSys.updateRecord(type, number, "address", input); TODO
			break;
		case 4: //city
			input = prompt(cityPrompt, scanner, String.class);
			if(input == null){
				return false;
			}
			//recordFileSys.updateRecord(type, number, "city", input); TODO
			break;
		case 5: //state
			input = prompt(statePrompt, scanner, String.class);
			if(input == null){
				return false;
			}
			//recordFileSys.updateRecord(type, number, "state", input); TODO
			break;
		case 6: //zip
			input = prompt(zipPrompt, scanner, Integer.class);
			if(input == null){
				return false;
			}
			//recordFileSys.updateRecord(type, number, "zip", input); TODO
			break;
		case 7: //exit
			break;
		default:
			return false;
		}
		
		return true;
	}
	
	/**
	 * Elicits necessary information to generate a new Report for a Member or a Provider.
	 * Calls the RecordFileSystem's generateReport method.
	 * @param scanner
	 * @return
	 */
	public static boolean generateReport(Scanner scanner){
		String type, number;
		
		type = prompt(typePrompt, scanner, String.class);
		number = prompt(numberPrompt, scanner, Integer.class);
		
		if(type == null || number == null){
			return false;
		}
		
		//recordFileSys.requestReport(type, number); TODO
		
		return true;
	}
	
	/**
	 * Calls the RecordFileSystems requestProviderDirectory method and prints 
	 * the Privder Directory to the console.
	 * @return
	 */
	public static boolean requestProviderDir(){
		
		//recordFileSys.requestProviderDirectory(); TODO
		
		return true;
	}
	
	/**
	 * Elicits necessary information to update the Provider Directory.
	 * Calls the RecordFileSystem's updateProviderDirectory method.
	 * @param scanner
	 * @return
	 */
	public static boolean updateProviderDir(Scanner scanner){
		String option = prompt(providerDirectoryUpdateMenu, scanner, Integer.class);
		int field = Integer.parseInt(option);
		
		String input;
		
		switch(field){
		case 1: //service code
			input = prompt(serviceCodePrompt, scanner, Integer.class);
			if(input == null){
				return false;
			}
			//recordFileSys.updateProviderDirectory(option, input); TODO
			break;
		case 2: //service name
			input = prompt(serviceNamePrompt, scanner, String.class);
			if(input == null){
				return false;
			}
			//recordFileSys.updateProviderDirectory(option, input); TODO
			break;
		case 3: //service price
			input = prompt(servicePricePrompt, scanner, Double.class);
			if(input == null){
				return false;
			}
			//recordFileSys.updateProviderDirectory(option, input); TODO
			break;
		case 4: //exit
			break;
		default:
			
		}
		String number = prompt(serviceCodePrompt, scanner, Integer.class);
		String name = prompt(serviceNamePrompt, scanner, String.class);
		String price = prompt(servicePricePrompt, scanner, Double.class);
		
		return true;
	}
	
	/**
	 * Generic prompting method
	 * @param prompt 
	 * @param scanner
	 * @param type
	 * @return
	 */
	public static String prompt(String prompt, Scanner scanner, Class type){
		String input;
		System.out.println(prompt);
		input = scanner.next();
		//for numeric types, we need to ensure that the strings are parseable as numeric types. 
		if(type == Integer.class){
			try{
				Integer.parseInt(input);
			} catch (NumberFormatException e){
				System.out.println(selectionErr);
				return null;
			}
		}
		if(type == Double.class){
			try{
				Double.parseDouble(input);
			} catch (NumberFormatException e){
				System.out.println(selectionErr);
				return null;
			}
		}
		
		if(input.equals("") || input.equals("\n")){
			return null;
		}
		
		return input;
	}

}
