package com.jspider.cardekho.mainManu;

import java.util.Scanner;

import com.jspider.cardekho.operations.CarOperations;
public class MainManu {
	static boolean choose = true;
	
	public static void mainMenu() {
		System.out.println("=====MainManu====\n"
				+"1.View All Cars\n"
				+"2.Search Car\n"
				+"3.Add Car\n"
				+"4.Remove Car\n"
				+"5.Update Car\n"
				+"6.Exit");
		System.out.println("SELECT ONE OPTION: ");
		
	}
    
    	 public static void main(String[] args) {
    		 
    		 CarOperations caroperations =new CarOperations();
        	 Scanner scanner = new Scanner(System.in);
        	 
        	 while(choose==true) {
        		 mainMenu(); 
        	int  choise = scanner.nextInt();
        	 switch (choise) {
    		case 1:
    			caroperations.viewAllCars();
    			break;
    		case 2:
    			caroperations.searchMethod();
    			break;
    		case 3:
    			caroperations.addCar();
    			break;
    		case 4:
    			caroperations.removeCar(scanner);
    			break;
    		case 5:
    			caroperations.updateCar(scanner);
    			break;
    		case 6:
    			System.out.println("....Thank You....");
    			System.out.println("....Visit Again....");
    			choose=false;
    			break;
    		default:
    			System.out.println("Invalid input plz try Again");
    			break;
        	 }
        	 }
        	 }
}
      