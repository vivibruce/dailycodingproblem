/*
Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

    10 = max(10, 5, 2)
    7 = max(5, 2, 7)
    8 = max(2, 7, 8)
    8 = max(7, 8, 7)

*/
import java.util.Scanner;

public class MaxofSubArray {
    int size;
    int arr[];
    int wsize;
    public MaxofSubArray(int size,int wsize)
    {
        this.size=size;
        arr = new int[size];
        this.wsize = wsize;
    }
    void initialize()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + this.size+" elements into the array");
        for(int i=0;i<this.size;i++)
        {
            this.arr[i] = scan.nextInt();
        }
        scan.close();
    }
    void findSubarrayMax()
    { 
        for(int i=0;i<this.arr.length-this.wsize+1;i++)
        {
           
           System.out.println( findMax(i));
        }
    }
    // 10 5 2 7 8 7
    int findMax(int ind)
    {
        System.out.println("find max called");
        int max = this.arr[ind];
        for(int i=ind;i<ind+this.wsize;i++)
        {
            if(this.arr[i]>max)
            {
                max= this.arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MaxofSubArray ms = new MaxofSubArray(6, 2);
        ms.initialize();
        ms.findSubarrayMax();
    }
}
