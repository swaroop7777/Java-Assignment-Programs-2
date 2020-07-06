package supermarketconsole;

import java.util.Scanner;

public class Fruits {
	static double fcost=0;
	public static double getCost() {
		Scanner sc=new Scanner(System.in);
		double applesperkg=90.65;
		double Orangesperkg=60.59;
		double WaterMelCost=80.34;
		double PapayaCost=53.56;
			System.out.println("Available Fruits:");
			System.out.println("1.Apples");
			System.out.println("2.Oranges");
			System.out.println("3.WaterMelons");
			System.out.println("4.Papaya");
			System.out.println("5.Back To Main Menu");
			System.out.println("Enter the category of Fruit Customer took:");
			int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("No. of Kgs of Apples Taken?"+"\t cost per kg:"+(applesperkg));
			int a=sc.nextInt();
			fcost+=Math.ceil(applesperkg*a);
			Display.display("Apples(in kg)       "+fcost+"         "+a+"kg");
			break;
		case 2:
			System.out.println("No. of Kgs of Oranges Taken?"+"\t cost per kg:"+(Orangesperkg));
			int o=sc.nextInt();
			fcost+=Math.ceil(Orangesperkg*o);
			Display.display("Oranges(in kg)      "+fcost+"          "+o+"kg");
			break;
		case 3:
			System.out.println("No. of Watermelons Taken?"+"\t cost per one Melon:"+(WaterMelCost));
			int w=sc.nextInt();
			fcost+=Math.ceil(WaterMelCost*w);
			Display.display("Watermelon(s)       "+fcost+"           "+w);
			break;
		case 4:
			System.out.println("No. of Papayas Taken?"+"\t cost per one Papaya:"+(PapayaCost));
			int p=sc.nextInt();
			fcost+=Math.ceil(PapayaCost*p);
			Display.display("Papaya(s)           "+fcost+"          "+p);
			break;
		case 5:
			SuperMarket.console();
		default:
			System.out.println("Fruit Not Present.");
			fcost+=0.0;
			
		}
		return fcost;
	}
			
}
