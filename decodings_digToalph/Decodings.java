/*
Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed
*/
import java.util.Scanner;
public class Decodings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(count_decoding(str.toCharArray(), str.length()));
    }
    static int count_decoding(char arr[], int n)
    {
        int dp[] =new int[n+1];
        dp[0] = 1;
        dp[1]= 1;
        if(arr[0]=='0')
            return 0;
        for(int i=2;i<=n;i++)
        {   
            if(arr[i-1]>'0')
                dp[i] = dp[i-1];
                
            if((arr[i-1]=='1'||arr[i-1]=='2')&&arr[i-2]<'7')
            {
                dp[i]+=dp[i-2];
            }

        }


        return dp[n];
    }
    // static int count_decoding(char arr[], int n)
    // {
    //     if(n==0 || n==1)
    //         return 1;
    //     if(arr[0]=='0')
    //         return 0;
    //     int count = 0;
    //     if(arr[n-1] > '0')
    //         count = count_decoding(arr, n-1);
        
    //     if((arr[n-1] == '1' || arr[n-1] == '2') && arr[n-2] < '7')
    //         count+=count_decoding(arr, n-2);
        
    //     return count;
        
    // }
 }
    

