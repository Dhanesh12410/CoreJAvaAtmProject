package project1;

import java.util.Scanner;

class Atm
{
	int cardno,password,choice;
	int balance=100000;
	Scanner sc=new Scanner(System.in);
	
	
		void Start()
		{
			System.out.println("***Welcome***");
			System.out.println("Please enter your card and your card no");
			cardno=sc.nextInt();
			for(int i=0;i<=20;i++)
			{
				
				
			if(i==cardno)
			{
				System.out.println("Enter your card password");
				password=sc.nextInt();
				if(password==1234)
				{
					while(true)
					{
					System.out.println("Enter your choice");
					System.out.println("1.Withdraw");
					System.out.println("2.Check balance");
					System.out.println("3.Deposite");
					System.out.println("4.Transfer");
					System.out.println("5.Exit");
					choice=sc.nextInt();
					
					switch(choice)
					{
					case 1:
							System.out.println("Enter the amount want to withdraw");
							int amount=sc.nextInt();
							
							if(balance>amount)
							{
							System.out.println("***Take your money****");
							}
							else
							{
								System.out.println("insufficient fund");
							}
							balance=balance-amount;
							System.out.println("\nDo you wish to see balance");
							System.out.println("1.yes");
							System.out.println("2.no");
							int n=sc.nextInt();
							if(n==1)
							{
								System.out.println("Balance="+balance);
							}
							else
							{
								System.out.println("Thank you");
							}
							break;
						
					case 2:
							System.out.println("Your Balance="+balance);
							break;
					
					case 3:
							int deposite;
							System.out.println("Enter the amount value to deposit");
							deposite=sc.nextInt();
							System.out.println("Insert you cash");
							balance=balance+deposite;
							System.out.println("The amount has been deposited");
							System.out.println("\nDo you wish to see balance");
							System.out.println("1.yes");
							System.out.println("2.no");
							int v=sc.nextInt();
							if(v==1)
							{
								System.out.println("Balance="+balance);
							}
							else
							{
								System.out.println("Thank you");
							}
							break;
							
					case 4:
							System.out.println("Enter tha ac no which you want to transfer ");
							int num=sc.nextInt();
							System.out.println("Enter the amount to Transfer");
							int amo=sc.nextInt();
							if(amo<=balance)
							{
								System.out.println("The amount has been tranfered successfully to the ac"+num+ "amount="+amo);
							}
							else
							{
								System.out.println("Insufficient fund");
							}
							balance=balance-amo;
							System.out.println("\nDo you wish to see balance");
							System.out.println("1.yes");
							System.out.println("2.no");
							int c=sc.nextInt();
							if(c==1)
							{
								System.out.println("Balance="+balance);
							}
							else
							{
								System.out.println("Thank you");
							}
							break;
						
					case 5:
							System.out.println("Thank you");
							System.exit(0);
							
					}
					}
					
					
				}
				else
				{
					System.out.println("your passowrd is Wrong");
				}
				
			}
			
			
		}
			}
		}
		


public class AtmProject extends Atm
{
	public static void main(String[] args)
	{
		AtmProject ap=new AtmProject();
				ap.Start();
	}
}


			
		
	
