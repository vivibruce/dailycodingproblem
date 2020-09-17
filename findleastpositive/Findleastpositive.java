import java.util.ArrayList;
import java.util.Scanner;
class Findleastpositive{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter numbers");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int shift = segregate(arr);
        int arr2[]=new int[arr.length-shift];
        for(int i=shift,j=0;i<arr.length;i++,j++)
        {
            arr2[j] = arr[i];
        }
        System.out.println(findleastpositive(arr2)); 

    }
    static int segregate(int[] arr)
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j+=1;
            }    
        }
        return j;
    }
    static int findleastpositive(int[] arr){
        int len = arr.length;
        System.out.println(len);
        for(int i=0;i<arr.length;i++)
        {
            if((Math.abs(arr[i])-1 < len) && arr[Math.abs(arr[i])-1]>0){
                arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
            }
        }
        int i=0;
        for(i=0;i<len;i++)
        {
            if(arr[i]>0)
                break;
        }
        return i+1;    
    }
}