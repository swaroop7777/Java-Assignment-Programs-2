package supermarketconsole;

import java.util.Scanner;

public class HouseHold {
	static double fcost=0;
	public static double getCost() {
		Scanner sc=new Scanner(System.in);
		double Flourperkg=50.32;
		double Riceperkg=55.78;
		double OilCost=100.02;
			System.out.println("Available HouseHold Items:");
			System.out.println("1.Wheat Flour");
			System.out.println("2.Rice");
			System.out.println("3.Cooking Oil");
			System.out.println("4.Back To Main Menu");
			System.out.println("Enter the category of HouseHold Item Customer took:");
			int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("No. of Kgs of Wheat Flour Taken?"+"\t cost per kg:"+(Flourperkg));
			int a=sc.nextInt();
			fcost+=Math.ceil(Flourperkg*a);
			Display.display("Wheat Flour(in kg) "+fcost+"         "+a+"kg");
			break;
		case 2:
			System.out.println("No. of Kgs of Rice Taken?"+"\t cost per kg:"+(Riceperkg));
			int o=sc.nextInt();
			fcost+=Math.ceil(Riceperkg*o);
			Display.display("Rice(in kg)         "+fcost+"         "+o+"kg");
			break;
		case 3:
			System.out.println("No. of lit of Oil Taken?"+"\t cost per one lit:"+(OilCost));
			int w=sc.nextInt();
			fcost+=Math.ceil(OilCost*w);
			Display.display("Cooking Oil(in lit) "+fcost+"          "+w+"lit");
			break;
		case 4:
			SuperMarket.console();
		default:
			System.out.println("HouseHold Item Not Present.");
			fcost+=0.0;
			
		}
		return fcost;
}
}
