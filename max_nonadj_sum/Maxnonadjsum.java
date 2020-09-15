/*
Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5
*/
import java.util.Scanner;
class Maxnonadjsum{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int len = scan.nextInt();
		int inplst[]=new int[len];
		for(int i=0;i<len;i++)
		{
			inplst[i] = scan.nextInt();
		}
		int included_sum = inplst[0];
		int excluded_sum = 0;
		for(int i=1;i<len;i++){
			int temp = Math.max(included_sum, excluded_sum);

			included_sum = excluded_sum + inplst[i];
			excluded_sum = temp;
		}
		System.out.println(Math.max(included_sum, excluded_sum));
	}
}