package hotelmanagement;

import java.util.Scanner;

public class CheckRoom {
	Payment p = new Payment();
	static String Luxrooms[] = { "lx1-Available", "lx2-Available", "lx3-Available" };
	static String Delxrooms[] = { "dlx1-Available", "dlx2-Available", "dlx3-Available" };
	static String Regrooms[] = { "reg1-Available", "reg2-Available", "reg3-Available" };

	public void roomBooking() {
		System.out.println("Hey! Here are the available room types, which category you wanna search or Book?");
		System.out.println("1.Luxury");
		System.out.println("2.Deluxe");
		System.out.println("3.Regular");
		System.out.println("4.Go to MainMenu");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of room you want(1/2/3)?");
		int choice = sc.nextInt();
		int count = 0;
		switch (choice) {
		case 1:
			System.out.println("You chose Luxury Rooms..");
			System.out.println("Here are List of Available/unAvailable Rooms:");

			for (String s : Luxrooms) {
				System.out.println(s);
			}
			for (String i : Luxrooms) {
				String res[] = i.split("-");
				if (res[1].equals("unavailable")) {
					count++;
				}
			}
			if (count == 3) {
				System.out.println("All rooms are Full For now.. Please Check in Other categories... ");
				roomBooking();
			}
			System.out.println("\nCommon now.. Please Put Your Focus here While Entering Values From Here...");
			System.out.println("You sure you want to book a luxury room(PRESS y/n)? (cost per night:1350/-)");
			char ch = sc.next().charAt(0);
			if (ch == 'y') {
				System.out.println("Enter the Luxury Room you wanna book from above list..");
				String book = sc.next();
				for (String str : Luxrooms) {
					String res[] = str.split("-");
					if (book == res[0] && res[1].equals("unavailable")) {
						System.out.println(
								"You are trying to book Already Booked room, Please Choose Another Available rooms..");
						roomBooking();
					}
				}
				switch (book) {
				case "lx1":
					p.luxPayment();
					System.out.println("Room Booked Successfully...");
					Luxrooms[0] = "lx1-unavailable" + "-" + p.booking_id;
					HotelConsole.main(null);
					break;
				case "lx2":
					p.luxPayment();
					System.out.println("Room Booked Successfully...");
					Luxrooms[1] = "lx2-unavailable" + "-" + p.booking_id;
					HotelConsole.main(null);
					break;
				case "lx3":
					p.luxPayment();
					System.out.println("Room Booked Successfully...");
					Luxrooms[2] = "lx3-unavailable" + "-" + p.booking_id;
					HotelConsole.main(null);
					break;
				default:
					System.out.println("Choose Valid Luxury room from the list:");
					roomBooking();
				}

			}
			if (ch == 'n') {
				roomBooking();
			}
			break;
		case 2:
			System.out.println("You chose Deluxe Rooms..");
			System.out.println("Here are List of Available/unAvailable Rooms:");
			for (String s : Delxrooms) {
				System.out.println(s);
			}
			for (String i : Delxrooms) {
				String res[] = i.split("-");
				if (res[1].equals("unavailable")) {
					count++;
				}
			}
			if (count == 3) {
				System.out.println("All rooms are Full For now.. Please Check in Other categories... ");
				roomBooking();
			}
			System.out.println("You sure you want to book a Deluxe room(press y/n)? (cost per night:1100/-)");
			char ch1 = sc.next().charAt(0);
			if (ch1 == 'y') {
				System.out.println("Enter the Deluxe Room you wanna book from above list..");
				String book = sc.next();
				for (String str : Delxrooms) {
					String res[] = str.split("-");
					if (book == res[0] && res[1].equals("unavailable")) {
						System.out.println(
								"You are trying to book Already Booked room, Please Choose Another Available rooms..");
						roomBooking();
					}
				}
				switch (book) {
				case "dlx1":
					p.delxPayment();
					System.out.println("Room Booked Successfully...");
					Delxrooms[0] = "dlx1-unavailable" + "-" + p.booking_id;
					HotelConsole.main(null);
					break;
				case "dlx2":
					p.delxPayment();
					System.out.println("Room Booked Successfully...");
					Delxrooms[1] = "dlx2-unavailable" + "-" + p.booking_id;
					HotelConsole.main(null);
					break;
				case "dlx3":
					p.delxPayment();
					System.out.println("Room Booked Successfully...");
					Delxrooms[2] = "dlx3-unavailable" + "-" + p.booking_id;
					HotelConsole.main(null);
					break;
				default:
					System.out.println("Choose Valid Deluxe room from the list:");
					roomBooking();
				}

			} else {
				roomBooking();
			}
			break;
		case 3:
			System.out.println("You chose Regular Rooms..");
			System.out.println("Here are List of Available/unAvailable Rooms:");
			for (String s : Regrooms) {
				System.out.println(s);
			}
			for (String i : Regrooms) {
				String res[] = i.split("-");
				if (res[1].equals("unavailable")) {
					count++;
				}
			}
			if (count == 3) {
				System.out.println("All rooms are Full For now.. Please Check in Other categories... ");
				roomBooking();
			}
			System.out.println("You sure you want to book a Regular room(press y/n)? (cost per night:800/-)");
			char ch2 = sc.next().charAt(0);
			if (ch2 == 'y') {
				System.out.println("Enter the Regular Room you wanna book from above list..");
				String book = sc.next();
				for (String str : Regrooms) {
					String res[] = str.split("-");
					if (book == res[0] && res[1].equals("unavailable")) {
						System.out.println(
								"You are trying to book Already Booked room, Please Choose Another Available rooms..");
						roomBooking();
					}
				}
				switch (book) {
				case "reg1":
					p.regPayment();
					System.out.println("Room Booked Successfully...");
					Regrooms[0] = "reg1-unavailable" + "-" + p.booking_id;
					HotelConsole.main(null);
					break;
				case "reg2":
					p.regPayment();
					System.out.println("Room Booked Successfully...");
					Regrooms[1] = "reg2-unavailable" + "-" + p.booking_id;
					HotelConsole.main(null);
					break;
				case "reg3":
					p.regPayment();
					System.out.println("Room Booked Successfully...");
					Regrooms[2] = "reg3-unavailable" + "-" + p.booking_id;
					HotelConsole.main(null);
					break;
				default:
					System.out.println("Choose Valid Regular room from the list:");
					roomBooking();
				}

			}
			if (ch2 == 'n') {
				roomBooking();
			}
			break;
		case 4:
			HotelConsole.MainConsole();
		default:
			System.out.println("Select valid option from the list of room categories available..");
			roomBooking();
		}
	}
}
