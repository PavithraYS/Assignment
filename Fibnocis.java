package training;

import java.util.Scanner;

public class Fibnocis {
	
	private static int findSum(int n) {
		int curVal=1,preVal=0,sum=0,temp;
		if(n<=0)
			return 0;
		if(n==1)
			return 1;
		sum=1;
		for(int i=2;i<n;i++)
		{
			temp=curVal;
			curVal=preVal+curVal;
			preVal=temp;
			sum+=curVal;
		}
		return sum;
		
	}
	 static void findSeries(int n)
	    {
	        int prev = 0, cur= 1, i;
	 
	        if (n < 1)
	            return;
	        System.out.print(prev + " ");
	        for (i = 1; i < n; i++)
	        {
	            System.out.print(cur + " ");
	            int next = prev + cur;
	            prev = cur;
	            cur = next;
	        }
	    }
	 private static int oddFibs(int n) {
		 int prevNum=0,curNumber=1,temp,sum=0;
		 for(int i=0;i<n;i++)
		 {
			 temp=prevNum;
			 prevNum=prevNum+curNumber;
			 curNumber=temp;
			 if(curNumber%2==0)
			 {
				 sum+=curNumber;
			 }
		 }
		 System.out.println("hii");
		 return sum;
	 }
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		System.out.println("hello");
		System.out.println("enter");
		switch(choice) {
		
		case 1:System.out.println("number of series");
				findSeries(n);
		break;
		case 2 :System.out.println("sum of the series= " + findSum(n));
		break;
		case 3:System.out.println("sum of odd number series=" +oddFibs(n));
			
		
		}
	
		

	}

}

