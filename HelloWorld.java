
import java.util.Scanner;
public class AreaCircle{
    
    public static void main(String[] args){
        
       
        
        int radius;
        double area;
        Scanner sc = new Scanner(System.in);
       
        
        System.out.println("enter radius :");
        radius= sc.nextInt();
        
        area=(radius*radius)*Math.PI;
        System.out.println("enter area :"+ area);
        
        
    }
}
