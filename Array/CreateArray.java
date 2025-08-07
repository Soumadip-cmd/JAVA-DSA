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
            System.out.print("Enter the Length of Array : ");
            n=sc.nextInt();
            int arr[] = new int[n];
            create(arr,n);
            printArr(arr);
      }
}