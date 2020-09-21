import java.util.*;
public class Log {
    int max;
    int id[];
    int curr = 0;

    public Log(int max) {
        this.max = max;
        this.id = new int[max];
        this.curr = 0;
    }
    void record(int order_id){
        this.id[curr] = order_id;
        this.curr = (this.curr + 1)%this.max;
    }
    int get_last(int i)
    {
        return this.id[(this.curr-i+this.max)%max];
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        Log log = new Log(n);
        for(int i=0;i<20;i++)
        {
            log.record(i);
        }
        
        System.out.println(log.get_last(5)); 
        System.out.println(log.get_last(1)); 
        System.out.println(log.get_last(9)); 
    } 
}

