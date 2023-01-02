package singlerowcolumn;

import java.util.Arrays;

public class sample2_string_array 
{
	public static void main(String[] args)
	{
		
		String [] ar = new String [5];
		ar[0] = "ramesh";
		ar[1]="ganesh";
		ar[2]="chintu";
		ar[3]="pintu";
		ar[4]="pandurang";
		System.out.println(ar.length);
		Arrays.sort(ar);
		System.out.println("----------------------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----------------------");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----------------------");
		
		
		
	}

}
