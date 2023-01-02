package singlerowcolumn;

import java.util.Arrays;

public class sample5_even_and_odd_no
{

	public static void main(String[] args) 
	{
		int [] ar = {17,29,49,36,27};
		Arrays.sort(ar);
		System.out.println(ar.length);
		System.out.println("------even no");
		
	for(int i=0;i<=4;i++)
	{
		if(ar[i]%2==0)
		{
			System.out.println(ar[i]);
		}
		
	}
	System.out.println("------odd no");
	
	for(int i=0;i<=4;i++)
	{
		if(ar[i]%2!=0)
		{
			System.out.println(ar[i]);
		}
	}
		
		
	}
}
