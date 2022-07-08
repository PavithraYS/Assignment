package training;



import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting range");
		int a=sc.nextInt();
		System.out.println("enter the ending range");
		int b=sc.nextInt();
		
		System.out.println("the prime number in between the range");
		
		for(int i=a;i<=b;i++)
		{
			int fact=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					fact=fact+1;
				}
			}
			if(fact==2)
				System.out.println(i+",is a prime number");

		}
		

	}

}