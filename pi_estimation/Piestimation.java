import java.util.Random;
public class Piestimation {
    public static void main(String[] args) {
        Random random = new Random();
        int circle_count = 0;
        int square_count = 0;
        for(int i=0;i<100000;i++)
        {
            double x = random.nextDouble();
            double y = random.nextDouble();
            if(x*x + y*y <= 1)
            {
                circle_count++;
                
            }
            square_count++;
            // System.out.println(circle_count+" "+ square_count);
            double pi = (double)4*circle_count/square_count;
            if(i%50 == 0){
                System.out.println(i+" iteration "+ pi);
            }
        }
        
        
    }
}
