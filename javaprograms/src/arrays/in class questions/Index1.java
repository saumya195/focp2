/* author :SAUMYA GUPTA 18CSU195
   version:1.0.0
   PURPOSE - Write a Java program to find the index of an array element in an array of size 10. The program should not use any function other than main ( ) functions.*/
import java.util.*; 
class Index1 { 
    public static int findIndex(int array[], int t) 
    { 
        if(array==null)
        { 
            return -1; 
        }  
        int i=0; 
        while(i<10) 
        { 
            if(array[i]==t) 
            { 
                return i+1; 
            } 
            else
            { 
                i=i+1; 
            } 
        } 
        return -1; 
    } 
    public static void main(String args[])
    { 
    int array[],i,t;
    array=new int[10];
    System.out.println("enter elements");
    Scanner s=new Scanner(System.in);
    for (i=0;i<10;i++)
    array[i]=s.nextInt();
    System.out.print("enter element");
    t=s.nextInt();
        System.out.println("Index position of element is: "
                           + findIndex(array,t)); 
    } 
} 