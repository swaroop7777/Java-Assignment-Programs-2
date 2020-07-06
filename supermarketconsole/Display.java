package supermarketconsole;
public class Display {
	static int count = 0;
	static String[] finbill = new String[20];

	public static void display(String s) {
		if (s == (null)) {
			System.out.println("----------BILL DETAILS FOR ITEMS TAKEN-----------");
			System.out.println("ITEM           " + "     PRICE      " + "QUANTITY       ");
			for (int i = 0; i < finbill.length; i++) {
				if (finbill[i] != null)
					System.out.println(finbill[i]);
			}
			System.out.println("------TOTAL BILL----" +SuperMarket.result);
		} else {
			finbill[count] = s;
			count++;
		}
	}

}
