import java.util.*;
public class CreateArray{
      // create Array
      public static void create(int arr[],int len){

            Scanner sc=new Scanner(System.in);
            System.out.println("\n\n\t Enter Numbers --- \n");
            for(int i=0;i<len;i++)
            {
                  System.out.print("NUM["+i+"]= ");
                  arr[i]=sc.nextInt();
            }
            
      }
      // Linear Search Array
      public static int linearSearch(int arr[],int key){
            for(int i=0;i<arr.length;i++)
            {
                  if(key==arr[i])
                  {
                        return i;
                  }
            }
            return -1;
      }
      
      // Print Array
      public static void printArr(int arr[]){
            System.out.println("\n---- Printed Array ----\n");
            for(int i=0;i<arr.length;i++)
            {
                  System.out.println("NUM["+i+"] = "+arr[i]);
            }
      }
      public static void main(String args[]){
            int n;
            Scanner sc=new Scanner(System.in);
            // create
            System.out.print("Enter the Length of Array : ");
            n=sc.nextInt();
            int arr[] = new int[n];
            create(arr,n);
            
            // print
            printArr(arr);

            // search
            int val,pos;
            System.out.print("Enter the Searched number - ");
            val=sc.nextInt();
            pos=linearSearch(arr,val);
            if(pos==-1)
            {
                  System.out.println(val+" Value is not found");
            }
            else{
                  System.out.println(val+" Value is found at position "+(pos+1));
            }
      }
}