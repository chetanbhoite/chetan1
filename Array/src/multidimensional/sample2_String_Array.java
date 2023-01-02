package multidimensional;

public class sample2_String_Array 
{

	//      0       1       2
	//  0  chetan  sachin  vivek
	//  1  nitin   aditya  ritik
	
	public static void main(String[] args)
    {
		String [] [] ar=new String [2] [3];

		ar[0] [0] ="chetan ";
		ar[0] [1] ="sachin ";
		ar[0] [2] ="vivek ";
		ar[1] [0] ="nitin ";
		ar[1] [1] ="aditya ";
		ar[1] [2] ="ritik ";
		
		System.out.println(ar.length);
		System.out.println("----------------");
		
		for(int i=0;i<=(1);i++)
		{
			for(int j=0;j<=(2);j++)
			{
				System.out.print(ar[i] [j]+" ");
			}
			System.out.println();
		}
		
	}
}
