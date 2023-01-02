package singlerowcolumn;

import java.util.Arrays;

public class sample4 
{
	public static void main(String[] args) 
	{
		int [] ar= {10,20,40,55,70};
		System.out.println(ar.length);
		Arrays.sort(ar);
		System.out.println("---------------------");
		for(int i=0;i<=4;i++)
		{
            System.out.println(ar[i]);			
		}
		System.out.println("---------------------");
		for(int i=4;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		System.out.println("-----------------------");
		int sum=0;
		for(int i=0;i<=4;i++)
		{
			sum=sum+ar[i];
			System.out.println(sum);
		}
		System.out.println("----------------------");
		System.out.println(sum);
		
	}

}
