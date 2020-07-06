package hotelmanagement;

import java.util.Scanner;

public class CheckOut {
	String r_no;
	Scanner sc = new Scanner(System.in);

	public void checkOut() {
		System.out.println("Please Enter your Room no:");
		r_no = sc.nextLine();
		int cnt = 0;
		if (r_no.substring(0, 2).equals("lx")) {
			System.out.println("Please Enter your Booking Id:");
			int b_id=sc.nextInt();
			for (String i : CheckRoom.Luxrooms) {

				if (i.substring(0, 3).equals(r_no) && i.contains("unavailable") && Integer.parseInt(i.substring(16))==(b_id)) {
					CheckRoom.Luxrooms[cnt] = "lx" + cnt + "-Available";
					System.out.println("You have been Checked Out.. Thankyou Visit Again!");
					HotelConsole.MainConsole();
					cnt++;
				}
				System.out.println("Aren't you messing with me?? Room is Available.. (or) You Entered Invalid Booking_id");
				HotelConsole.MainConsole();

			}
		} else if (r_no.substring(0, 3).equals("dlx")) {
			System.out.println("Please Enter your Booking Id:");
			int b_id=sc.nextInt();
			for (String i : CheckRoom.Delxrooms) {

				if (i.substring(0, 4).equals(r_no) && i.contains("unavailable") && Integer.parseInt(i.substring(17))==(b_id)) {
					CheckRoom.Delxrooms[cnt] = "dlx" + cnt + "-Available";
					System.out.println("You have been Checked Out.. Thankyou Visit Again!");
					HotelConsole.MainConsole();
					cnt++;
				}
			}
			System.out.println("Aren't you messing with me?? Room is Available.. ");
			HotelConsole.main(null);

		} else if (r_no.substring(0, 3).equals("reg")) {
			System.out.println("Please Enter your Booking Id:");
			int b_id=sc.nextInt();
			for (String i : CheckRoom.Regrooms) {

				if (i.substring(0, 4).equals(r_no) && i.contains("unavailable") && Integer.parseInt(i.substring(17))==(b_id)) {
					CheckRoom.Regrooms[cnt] = "dlx" + cnt + "-Available";
					System.out.println("You have been Checked Out.. Thankyou Visit Again!");
					HotelConsole.MainConsole();
					cnt++;
				}
			}
			System.out.println("Aren't you messing with me?? Room is Available.. ");
			HotelConsole.MainConsole();

		} else {
			System.out.println("Please Select Valid room code!!");
			HotelConsole.MainConsole();
		}

	}

}
