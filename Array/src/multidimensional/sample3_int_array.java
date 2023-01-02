package multidimensional;

import java.util.Arrays;

public class sample3_int_array 
{
	public static void main(String[] args)
	{
		
	int [] [] ar=new int[3][4];
	//  0  1  2  3 
	//0 1  2  3  4
	//1 5  6  7  8
	//2 9 10 11 12
	ar[0][0] = 1;
	ar[0][1] = 2;
	ar[0][2] = 3;
	ar[0][3] = 4;
	ar[1][0] = 5;
	ar[1][1] = 6;
	ar[1][2] = 7;
	ar[1][3] = 8;
	ar[2][0] = 9;
	ar[2][1] = 10;
	ar[2][2] = 11;
	ar[2][3] = 12;
	
	
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=3;j++)
			
		{
		 System.out.print(ar[i][j]+"  ");
		}
		 System.out.println();
	}
	
	System.out.println("----------------------");
	
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=3;j++)
			
		{
		 System.out.print(ar[i][j]+ar[i][j]+"  ");
		}
		 System.out.println();
	}
	
	System.out.println("----------------------");
	
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=3;j++)
			
		{
		 System.out.print((ar[i][j]+ar[i][j])*2+"  ");
		}
		 System.out.println();
	}
	
	}
}
