import java.util.Scanner;
public class BalanceParanthesis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        char stack[] =new char[input.length()];
        int top = 0;
        
        stack[top] = input.charAt(0);
        for(int i=1;i<input.length();i++)
        {
            // System.out.println(input.charAt(i));
            if(top == -1)
            {
                top++;
                stack[top] = input.charAt(i);
            }
            else if((stack[top]=='{' && input.charAt(i)=='}') || (stack[top]=='(' && input.charAt(i)==')') || (stack[top]=='[' && input.charAt(i)==']')){
                top--;
            }
            else{
                top++;
                stack[top] = input.charAt(i);
            }
        }
        if(top == -1){
            System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }
    }
}
