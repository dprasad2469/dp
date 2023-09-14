package Test;
import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int r,sum=0,temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;			
		}
		if(temp==sum)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstong");
		}

	}
}
