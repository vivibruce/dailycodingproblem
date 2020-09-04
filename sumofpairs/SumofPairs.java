import java.util.*;
class SumofPairs{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("size of array");
		int arrlen = scan.nextInt();
		int arr[]=new int[arrlen];
		System.out.println("Enter numbers");
		for(int i=0;i<arrlen;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter Target value");
		int target_value = scan.nextInt();
		int p1=0;
		int p2=arrlen-1;
		int flag=0;
		Arrays.sort(arr);
		while(p1<p2)
		{
			if(arr[p1]+arr[p2]==target_value){
				System.out.println("Pair of values are"+ arr[p1]+", "+arr[p2]);
				flag+=1;
				p1+=1;
				p2-=1;
			}
			else if(arr[p1]+arr[p2]<target_value)
				p1+=1;
			else
				p2-=1;
		}
		if(flag==0)
			System.out.println("not found pair");

	}
}