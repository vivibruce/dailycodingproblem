/*
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?s
*/
public class Product {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        arr= new int[size];
        int[] out = new int[size];
        int prod = 1;
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
            prod*=arr[i];
        }
        for(int i=0;i<size;i++)
        {
            out[i] = prod*Math.pow(arr[i], -1);
            System.out.println(out[i]);
        }
        


    }
    
}
