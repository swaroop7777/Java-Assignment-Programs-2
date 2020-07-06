package supermarketconsole;

import java.util.Scanner;

public class Snacks {
	static double fcost=0;
	public static double getCost() {
		Scanner sc=new Scanner(System.in);
		
		double LaysSmall=20.00;
		double LaysLarge=40.00;
		double ConeIceCream=35.00;
		double ChicPopcorn=80.34;
		double Namkeen=35.00;
			System.out.println("Available Snacks:");
			System.out.println("1.Lays(Small)");
			System.out.println("2.Lays(Large)");
			System.out.println("3.Cone IceCream");
			System.out.println("4.Chicken Popcorn");
			System.out.println("5.Namkeen");
			System.out.println("6.Back To Main Menu");
			System.out.println("Enter the category of Fruit Customer took:");
			int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("No. of packs of Lays(Small) Taken?"+"\t cost per one pack:"+(LaysSmall));
			int a=sc.nextInt();
			fcost+=Math.ceil(LaysSmall*a);  
			Display.display("Lays(Small)         "+fcost+"         "+a);
			break;
		case 2:
			System.out.println("No. of packs of Lays(Large) Taken?"+"\t cost per one pack:"+(LaysLarge));
			int o=sc.nextInt();
			fcost+=Math.ceil(LaysLarge*o);
			Display.display("Lays(Large)         "+fcost+"         "+o);
			break;
		case 3:
			System.out.println("No. of Cone IceCreams Taken?"+"\t cost per one Cone:"+(ConeIceCream));
			int w=sc.nextInt();
			fcost+=Math.ceil(ConeIceCream*w);
			Display.display("ConeIceCream        "+fcost+"         "+w);
			break;
		case 4:
			System.out.println("No. of packs of ChickenPopcorn Taken?"+"\t cost per one pack:"+(ChicPopcorn));
			int p=sc.nextInt();
			fcost+=Math.ceil(ChicPopcorn*p);
			Display.display("Chicken Popcorn      "+fcost+"        "+p);
			break;
		case 5:
			System.out.println("No. of packs of Namkeen Taken?"+"\t cost per one pack:"+(Namkeen));
			int n=sc.nextInt();
			fcost+=Math.ceil(Namkeen*n);
			Display.display("Namkeen              "+fcost+"        "+n);
			break;
		case 6:
			SuperMarket.console();
		default:
			System.out.println("Snack Not Present.");
			fcost+=0.0;
			
		}
		return fcost;

}
}
