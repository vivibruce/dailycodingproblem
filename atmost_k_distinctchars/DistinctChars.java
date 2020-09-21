import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class DistinctChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int max = scan.nextInt();
        int window = max;
        int max_window = window;
        StringBuilder result = new StringBuilder();
        int flag = 0;
        for(window =s.length(); window>=max;window--){
        for(int i=0;i<=s.length()-window;i++)
        {
            Set<Character> set = new HashSet<>();
            for(int j=i;j<i+window;j++)
            {    
                set.add(s.charAt(j));
            }
            // System.out.println("");
            if(set.size()==max)
            {
                max_window = max_window<window?window:max_window;
                result.delete(0, result.length());
                for(int k=i;k<i+window;k++)
                {
                    result.append(s.charAt(k));
                }
                flag = 1;
            }
            if(flag == 1){
                break;
            }
        }
        if(flag == 1){
            break;
        }
    }
        System.out.println(result+" maxwindow: "+ max_window);
    }
}
