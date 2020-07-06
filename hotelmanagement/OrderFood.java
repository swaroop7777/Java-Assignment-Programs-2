package hotelmanagement;

import java.util.Scanner;

public class OrderFood {
	public static double fcost = 0;

	public static void vegOrder() {

		double Idly = 20.00;
		double Dosa = 30.00;
		double MasalaDosa = 35.00;
		double VegPullav = 80.00;
		Scanner sc = new Scanner(System.in);
		System.out.println("Available Vegeterian:");
		System.out.println("1.Idly");
		System.out.println("2.Dosa");
		System.out.println("3.Masala Dosa");
		System.out.println("4.Veg Pullav");
		System.out.println("5.Go to Hotel Console for bill Conclusion..");
		System.out.println("6.Order non-vegeterian items");
		System.out.println("Enter the category of vegeterian dish customer took:");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("No. of Idly's Taken?" + "\t cost per one Idly:" + (Idly));
			int a = sc.nextInt();
			fcost += (Idly * a);
			DisplayFoodBill.display("Idly\t\t\t  " + fcost + "\t\t\t  " + a);
			vegOrder();
			break;
		case 2:
			System.out.println("No. of Dosa Taken?" + "\t cost per one Dosa:" + (Dosa));
			int o = sc.nextInt();
			fcost += (Dosa * o);
			DisplayFoodBill.display("Dosa\t\t\t  " + fcost + "\t\t\t  " + o);
			vegOrder();
			break;
		case 3:
			System.out.println("No. of Masala Dosa Taken?" + "\t cost per one Masala Dosa:" + (MasalaDosa));
			int w = sc.nextInt();
			fcost += (MasalaDosa * w);
			DisplayFoodBill.display("Masala Dosa\t\t   " + fcost + "\t\t\t  " + w);
			vegOrder();
			break;
		case 4:
			System.out.println("No. of Veg Pullav Taken?" + "\t cost per one Veg Pullav:" + (VegPullav));
			int p = sc.nextInt();
			fcost += (VegPullav * p);
			DisplayFoodBill.display("Veg Pullav\t\t   " + fcost + "\t\t\t  " + p);
			vegOrder();
			break;
		case 5:
			HotelConsole.res=fcost;
			HotelConsole.MainConsole();
			break;
		case 6:
			nonVegOrder();
			break;
		default:
			System.out.println("Food item Not Present.");
			fcost += 0.0;

		}

	}

	public static void nonVegOrder() {
		Scanner sc = new Scanner(System.in);
		double Chicken_65 = 105.00;
		double ChickenLol = 95.00;
		double Butnaan_ChiCurr = 150.00;
		double HydChicBir = 120.00;
		System.out.println("Available Non-Vegeterian:");
		System.out.println("1.Chicken-65");
		System.out.println("2.Chicken Lollipop");
		System.out.println("3.Butternaan With ChickenCurry");
		System.out.println("4.Hyderabadi Chicken Biriyani");
		System.out.println("5.Go To HotelConsole For TotalFoodBill Conclusion..");
		System.out.println("6.Order Vegeterian items");
		System.out.println("Enter the category of vegeterian dish customer took:");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("No. of Chicken-65 Taken?" + "\t cost per one Chicken-65:" + (Chicken_65));
			int a = sc.nextInt();
			fcost += (Chicken_65 * a);
			DisplayFoodBill.display("Chicken-65\t\t    " + fcost + "\t\t\t  " + a);
			nonVegOrder();
			break;
		case 2:
			System.out.println("No. of Chicken Lollipop Taken?" + "\t cost per one Chicken Lollipop:" + (ChickenLol));
			int o = sc.nextInt();
			fcost += (ChickenLol * o);
			DisplayFoodBill.display("Chicken Lollipop\t   " + fcost + "\t\t\t  " + o);
			nonVegOrder();
			break;
		case 3:
			System.out.println(
					"No. of Butternaan With ChickenCurry Taken?" + "\t cost per one item:" + (Butnaan_ChiCurr));
			int w = sc.nextInt();
			fcost += (Butnaan_ChiCurr * w);
			DisplayFoodBill.display("Butternaan With ChickenCurry" + fcost + "\t\t\t  " + w);
			nonVegOrder();
			break;
		case 4:
			System.out.println("No. of Biriyani Taken?" + "\t cost per one Biryani:" + (HydChicBir));
			int p = sc.nextInt();
			fcost += (HydChicBir * p);
			DisplayFoodBill.display("Hyderabadi Chicken Biriyani" + fcost + "\t\t\t  " + p);
			nonVegOrder();
			break;
		case 5:
			HotelConsole.res=fcost;
			HotelConsole.MainConsole();
			break;
		case 6:
			vegOrder();
			break;
		default:
			System.out.println("Item Not Present.");
			fcost += 0.0;

		}
	}
}
