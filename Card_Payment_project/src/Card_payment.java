import java.util.ArrayList;
import java.util.Scanner;



interface printable{  
	void add_option();  
}

public class Card_payment implements printable{
	ArrayList card;
	double[] surcharge;
	Card_payment()
	{
		card=new ArrayList ();
		surcharge=new double[3];
		card.add("MasterCard");
		card.add("visa");
		card.add("Amex");
		surcharge[0]=1.5;
		surcharge[1]=1.5;
		surcharge[2]=3.0;
		
	}
	public void add_option()
	{
		System.out.println("input the name of the new card or payment method  ");
		Scanner input = new Scanner(System.in);
		String number = input.next();
		card.add(number);
		System.out.println("input the surharge of the new card or payment method  ");
		Scanner input2 = new Scanner(System.in);
		double Surcharge = input2.nextDouble();
		double[] newarr = new double[surcharge.length+1];
		for(int i=0 ;i<surcharge.length ; i++)
		{
			newarr[i]=surcharge[i];
		}
		newarr[surcharge.length]=Surcharge;
		surcharge=newarr;
	}
}
