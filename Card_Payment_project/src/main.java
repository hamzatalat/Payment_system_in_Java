import java.util.Scanner;


public class main extends Cash_payment{
	
	
	public static void main(String[] args) {
		int total_income=0;
		double total_surcharge= 0;
		int card_payment=0;
		
		Cash_payment a= new Cash_payment();
		Card_payment b= new Card_payment();
		int choice;
		for(choice=1;choice!=0;)
		{
			total_surcharge=0;
			System.out.println("Select the mode of payment \n 1. Cash \n 2. Card ");
			Scanner input1 = new Scanner(System.in);
			choice= input1.nextInt();
			if(choice==1)
			{
				System.out.println("please input the cash amount");
				//Scanner input1 = new Scanner(System.in);
				a.cash = input1.nextInt();
				total_income+=a.cash;
			}
			if(choice==2)
			{
				System.out.println("please select an option  " );
				for (int i=0;i<b.surcharge.length;i++)
				{
					System.out.print(i);
					System.out.print(" " );
					System.out.print(b.card.get(i) );
					System.out.println();
				}
				int c = input1.nextInt();
				double price = b.surcharge[c];
				System.out.println("please enter the amount  " );
				Scanner sc = new Scanner(System.in);
				int prices = sc.nextInt();
				card_payment+=prices;
				//System.out.println("The surcharge amount is " );
				total_surcharge=(price*prices)/100;
				//System.out.println((price*prices)/100 );
				
			}
			char chr='t';
			while(chr != 'c')
			{	
				System.out.println("Press e to exit ,c to continue adding more sales or v to view the sales " );
				Scanner sc = new Scanner(System.in); 
		        chr = sc.next().charAt(0);
		        if(chr == 'e')
		        {
		        	chr = 'c';
		        	choice = 0;
		        }
		        if(chr == 'v')
		        {
		        	System.out.print("Total Cash sales of today  " );
					System.out.print(total_income );
					System.out.println();
					System.out.print("Total Card sales of today  " );
					System.out.print(card_payment+total_surcharge );
					System.out.println();
					choice = 45;
		        }
			}
		}
		
	    }
	

}



































