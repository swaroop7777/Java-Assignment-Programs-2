package hotelmanagement;

public class DisplayFoodBill {
	static int count = 0;
	static String[] finbill = new String[20];

	public static void display(String s) {
		if (s == (null)) {
			System.out.println("----------BILL DETAILS FOR ITEMS TAKEN-----------");
			System.out.println("ITEM\t\t\t" + "     PRICE\t\t\t" + "QUANTITY\t\t\t");
			for (int i = 0; i < finbill.length; i++) {
				if (finbill[i] != null)
					System.out.println(finbill[i]);
			}
			System.out.println("------TOTAL BILL----" + HotelConsole.res);
		} else {
			finbill[count] = s;
			count++;
		}
	}

}
