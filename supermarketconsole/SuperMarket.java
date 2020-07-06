package supermarketconsole;

import java.util.Scanner;

public class SuperMarket {
static double result=0;
public static void main(String[] args) {
		
	console();
}
public static void console()
{
while(true)
{
	System.out.println("----------WELCOME TO SUPER MARKET CONSOLE APPLICATION---------");
	System.out.println("----AVAILABLE PRODUCT CATEGORIES--CHOOSE ONE!");
	System.out.println("1.FRUITS");
	System.out.println("2.HOUSEHOLD ITEMS");
	System.out.println("3.SNACKS");
	System.out.println("4.EXIT");
	System.out.println("ENTER PRODUCT NUMBER OR PRESS 4 TO EXIT APPLICATION AND GENERATE CUSTOMER BILL.");
	Scanner sc=new Scanner(System.in);
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		result=result+Fruits.getCost();
		break;
	case 2:
		result=result+HouseHold.getCost();
		break;
	case 3:
		result=result+Snacks.getCost();
		break;
	case 4:
		Display.display(null);
		System.exit(0);
	default:
		System.out.println("Please select valid option!!");
	
	
	}

}

}
}
