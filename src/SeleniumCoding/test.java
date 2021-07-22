package SeleniumCoding;

import java.util.Scanner;

public class test {
	public static void main(String args[] ) throws Exception {
		  Scanner s = new Scanner(System.in);   
	        //int al = s.nextInt();  
	        //System.out.println();
	        int[] a = new int[s.nextInt()];
	       int swapCount = 0;
	       for(int i= 0; i<a.length; i++)
	       {
	    	   a[i] = s.nextInt();
	    	   //System.out.println(a[i]);
	       }
	       
	       //System.out.println("Swap the array");
	       for(int i= 0; i<a.length-1; i++)
	       {
	           //i=0,1,2,3,4
	    	   for(int j= i+1; j<a.length; j++)
		       {
	    		   if(a[i]>a[j])
		           {
		                int temp = 0;
		                temp = a[i];
		                a[i] = a[j];
		                a[j] = temp;
		                
		                swapCount++;
		           }
		       }
	           
	       }
	       for(int i= 0; i<a.length; i++)
	       {
	    	   System.out.println(a[i]);
	    	   //System.out.println(a[i]);
	       }
	       
	       
	System.out.println(swapCount);

    }

}
