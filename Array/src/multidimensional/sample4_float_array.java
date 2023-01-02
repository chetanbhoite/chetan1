package multidimensional;

import java.util.Arrays;

public class sample4_float_array
{
  public static void main(String[] args) 
  {
	
    float [] [] ar = {{29,18,26,41},{73,27,16,21},{11,25,32,16}};
    
    
    
    for(int i=0;i<=3;i++)
    {
    	for(int j=0;j<=3;j++)
    	{
    		System.out.print((ar[i][j])/2+"  ");
    	}
    	System.out.println();
    }
   
    }
	
  }	
	

