package com.jspider.cardekho.operations;
import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.cardekho.entity.Car;
public class CarOperations {
	static ArrayList<Car> cars=new ArrayList<Car>(); //Car
	static boolean take =true;
	static Car car = new Car();
	public void searchMethod() {
		
		while(take==true) {
			System.out.println("1.Search By Id\n"
					+"2.Search by Name\n"
                    +"3.Search By Brand\n"
		            +"4.Search By FuelType\n"
                    +"5.Search By Price\n"
		            +"6.Search By Colour\n"
                    +"7.Go Back");
             System.out.println("SELECT ONE OPTION: ");
          Scanner scanner = new Scanner(System.in);	
		int search =scanner.nextInt();
		switch (search) {
		case 1:
			SearchById(scanner);
			break;
		case 2:
			searchByName(scanner);
			break;
		case 3:
			searchByBrand(scanner);
			//System.out.println("Search By Brand");
			break;
		case 4:
			searchByFuelType(scanner);
			//System.out.println("Search By fuelType");
			break;
		case 5:
			searchByPrice(scanner);
			break;
		case 6:
			searchByColour(scanner);
			break;
		case 7:
			return;
		default:
			System.out.println("Invalid Input  Plz Try Again ");
			break;
		
		}
	  }
	}
	
	
	// .........Search By Id.............
	public static void SearchById(Scanner scanner) {
		System.out.println("Enter Car ID: ");
		int id=scanner.nextInt();
		int count = 0;
		for(Car car :cars) {
			if (car.getCarId()==id) {
				System.out.println(car);
				count++;
				continue;
			}      
		 }
		if (count==0) {
			System.out.println("Car Not Found");
		}
		
	}
	
	//............Search By Name...........
	public static  void searchByName(Scanner scanner) {
		System.out.println("Enter Car Name: ");
		//Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		int count = 0;
		for(Car car :cars) {
		   if (car.getCarName().contentEquals(name)) {
				System.out.println(car);
				count++;
				continue;
			}
		}
		if (count==0) {
			System.out.println("Car Not Found");
		}
	}
	
	//...........Search By Brand...........
	public static  void searchByBrand(Scanner scanner) {
		System.out.println("Enter Car Brand: ");
		//=new Scanner(System.in);
		String brand=scanner.next();
		int count = 0;
		for(Car car :cars) {
			if (car.getCarName().contentEquals(brand)) {
				System.out.println(car);
				count++;
				continue;
			}  
		}
		if (count==0) {
			System.out.println("Car Not Found");
		}
	}
	
	//..............Search By FuelType...........
	public static  void searchByFuelType(Scanner scanner) {
		System.out.println("Enter Car Brand: ");
		//=new Scanner(System.in);
		
		String fuelType=scanner.next();
		int count=0;
		for(Car car :cars) {
			if (car.getCarName().contentEquals(fuelType)) {
				System.out.println(car);
				count++;
				continue;
			} 
		}
		if (count==0) {
			System.out.println("Car Not Found");
		}
	}
	
	//............Search By Price.........
	public static  void searchByPrice(Scanner scanner) {
		System.out.println("Enter Car MaxPrice: ");
		int maxPrice=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Car MinPrice: ");
		//=new Scanner(System.in);
		int minPrice=scanner.nextInt();
		int count=0;
		for(Car car :cars) {
			if (car.getCarPrice()<=maxPrice && car.getCarPrice()>=minPrice) {
				System.out.println(car);
				count++;
				continue;
			} 
		 }	
		if (count==0) {
			System.out.println("Car Not Found");
		}
	}
	//.........Search By Color..........
	public static void searchByColour(Scanner scanner) {
		System.out.println("Enter Car Name: ");
		//Scanner scanner=new Scanner(System.in);
		String colour=scanner.next();
		int count = 0;
		for(Car car :cars) {
		   if (car.getCarName().contentEquals(colour)) {
				System.out.println(car);
				count++;
				continue;
			}
		}
		if (count==0) {
			System.out.println("Car Not Found");
		}
	}
	
	//..........ADD CAR.........
	public void addCar() {
		System.out.println("How many cars you want to add?");
		Scanner sc =new Scanner(System.in);
		int choice = sc.nextInt();
		for(int i=1;i<=choice;i++) {
			Car car = new Car();
			System.out.println("Enter id : ");
			car.setCarId(sc.nextInt());
			System.out.println("Enter Name : ");
			car.setCarName(sc.next());
			System.out.println("Enter Model : ");
			car.setCarModel(sc.next());
			System.out.println("Enter Brand : ");
			car.setCarBrand(sc.next());
			System.out.println("Enter price : ");
			car.setCarPrice(sc.nextInt());
			System.out.println("Enter fuelType : ");
			car.setFuelType(sc.next());
			System.out.println("Enter colour : ");
			car.setColour(sc.next());
			cars.add(car);
			System.out.println("Car Added Successfully...");
		}
	}
	
	//........ VIEW ALL CARS........
	public void viewAllCars() {
		boolean present=false;
		for(Car car :cars) {
			present=true;
			System.out.println(car);
		}
		if(!present) {
			System.out.println("Car Not Found");
		}
	}
	
	//.......Remove The Car.......
	public void removeCar(Scanner scanner) {
		System.out.println("Enter Car Id : ");
		int id = scanner.nextInt();
		boolean present=false;
		for (Car car : cars) {
			if (car.getCarId()==id) {
				present=true;
				cars.remove(car);
				System.out.println("Car Deleted..");
				break;
			}
		}
		if (!present) {
			System.out.println("Car Not Found");
		}
	}

		

	
	//......Update the car.......
	public void updateCar(Scanner scanner) {
		boolean present=false;
		System.out.println("Enter The Car Id: ");
		int id = scanner.nextInt();
		for (Car car : cars) {
			if (car.getCarId()==id) {         
				present=true;
				System.out.println(car);
				System.out.println("1.Update Name\n"
				                    +"2.Update Model Name:\n"
						            +"3.Update Brand Name:\n"
				                    +"4.Update Car Price: \n"
					               	+"5.Update FuelTYpe: \n"
				                    +"6.Update Colour: \n");
				System.out.println("What do you want to update,Select it?");
				int choise = scanner.nextInt();
				switch (choise) {
				case 1:
					System.out.println("Enter New Name: ");					
					car.setCarName(scanner.next());
					System.out.println("Car Name Updated...");
					break;
				case 2:
					System.out.println("Enter New Model Name: ");				
					car.setCarModel(scanner.next());
					System.out.println("Car Model Name Updated...");
					break;
				case 3:
					System.out.println("Enter New Brand Name: ");	
					car.setCarBrand(scanner.next());
					System.out.println("Car Brand Name Updated...");
					break;
				case 4:
					System.out.println("Enter New Price: ");		
					car.setCarPrice(scanner.nextInt());
					System.out.println("Car Price Updated...");
					break;
				case 5:
					System.out.println("Enter New FuelType: ");	
					car.setFuelType(scanner.next());
					System.out.println("Car FuelType Updated...");
					break;
				case 6:
					System.out.println("Enter New Colour: ");		
					car.setColour(scanner.next());
					System.out.println("Car Colour Updated...");
					break;
				default:
					System.out.println(" invalid input,Try Again");
					break;
				}	
			
			}
		}
		if(!present)
			System.out.println("Car Not Found....");
	}
		
   }
}
	
	
    

