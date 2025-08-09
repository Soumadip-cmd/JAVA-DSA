import java.util.*;

public class SubArray {
      public static void main(String args[])
      {
            int arr[]={2,4,6,8,10};
            for(int i=0;i<arr.length;i++)
            {
                  
                  for(int j=0;j<arr.length;j++) //j=0 so 1st one (e.g-2) also be count 
                  {
                        
                        for( int k=i;k<=j;k++)
                        {
                              System.out.print("("+arr[k]+")");
                        }
                        System.out.print("\n");
                  }
                  System.out.println("\n");
            }
      }
}
