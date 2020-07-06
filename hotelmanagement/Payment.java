package hotelmanagement;

import java.util.Random;
import java.util.Scanner;

public class Payment {
	int booking_id;
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	public void luxPayment() {
		System.out.println("Enter no. of people want to stay in room?");
		int n = sc.nextInt();
		System.out.println("Amount to Pay:" + (n * 1350));
		booking_id = rand.nextInt(100);
		System.out.println("Your Booking_id is:" + booking_id);
		System.out.println("IMPORTANT: Please Keep this for Future Reference..!");
	}

	public void delxPayment() {
		System.out.println("Enter no. of people want to stay in room?");
		int n = sc.nextInt();
		System.out.println("Amount to Pay:" + (n * 1100));
		booking_id = rand.nextInt(100);
		System.out.println("Your Booking_id is:" + booking_id);
		System.out.println("IMPORTANT: Please Keep this for Future Reference..!");
	}

	public void regPayment() {
		System.out.println("Enter no. of people want to stay in room?");
		int n = sc.nextInt();
		System.out.println("Amount to Pay:" + (n * 800));
		booking_id = rand.nextInt(100);
		System.out.println("Your Booking_id is:" + booking_id);
		System.out.println("IMPORTANT: Please Keep this for Future Reference..!");
	}
}
