package hotelmanagement;

import java.util.Scanner;

public class HotelConsole {
	static double res;

	public static void main(String[] args) {
		MainConsole();
	}
	public static void MainConsole()
	{
	System.out.println("Welcome to Hotel Vinayaka Grand");
	System.out.println("What are you looking for?..");
	System.out.println("1.Room Availabily/Booking");
	System.out.println("2.Room Checkout");
	System.out.println("3.OrderFood");
	System.out.println("4.Display FoodBill");

	Scanner sc = new Scanner(System.in);
	System.out.println("Choose one of above 3 options..");
	int choice = sc.nextInt();
	switch (choice) {
	case 1:
		CheckRoom c = new CheckRoom();
		c.roomBooking();
		break;
	case 3:
		System.out.println("Enter Your Category:");
		System.out.println("1.Vegetarian");
		System.out.println("2.Non-Vegetarian");
		System.out.println("Choose one option..");
		int category = sc.nextInt();
		switch (category) {
		case 1:

			OrderFood.vegOrder();
			break;

		case 2:
			OrderFood.nonVegOrder();
			break;
		default:
			System.out.println("Enter valid option..");
			MainConsole();
		}
		break;

	case 2:
		CheckOut co = new CheckOut();
		co.checkOut();
		break;
	case 4:
		DisplayFoodBill.display(null);
		break;
	default:
		System.out.println("Please enter valid option!");
		MainConsole();
	}

}
}
