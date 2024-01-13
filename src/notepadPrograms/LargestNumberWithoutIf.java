package notepadPrograms;

import java.util.Scanner;

public class LargestNumberWithoutIf 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter First Number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter Second Number");
		int b=s.nextInt();

		int largest=a>b?a:b;
		System.out.println("Largest Number without using If condition is: "+largest);

	}

}
