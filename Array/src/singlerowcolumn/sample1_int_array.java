package singlerowcolumn;
import java.util.Arrays;

public class sample1_int_array
{
	public static void main(String[] args)
	{
		int [] ar = new int[4];
		ar[0]=83;
		ar[1]=30;
		ar[2]=94;
		ar[3]=29;
		
		System.out.println(ar[0]);
		
		System.out.println(ar.length);
		
		Arrays.sort(ar);
		
		System.out.println("--------------");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----------------");
		
		for (int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
