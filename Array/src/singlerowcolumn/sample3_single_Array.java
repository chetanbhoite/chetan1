package singlerowcolumn;

import java.util.Arrays;

public class sample3_single_Array 
{  
	public static void main(String[] args)
	{
		int[] ar= {10,30,70,19};
		
		System.out.println(ar.length);
		
		
		System.out.println("--------------------");
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		Arrays.sort(ar);
		
		System.out.println("--------in ascending direction--------");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("--------in descending direction--------");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
}
