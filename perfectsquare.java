import java.util.Scanner;
public class perfectsquare {
	    public static void main(String[] args) 
	    {
	    	Scanner sc=new Scanner(System.in);
	        double n = sc.nextDouble();
	        double m=sc.nextDouble();
	        double b= Math.sqrt(n*m);
	        if ((b - Math.floor(b)) == 0){
	        System.out.print("Yes");
	        }
	        else{
	            System.out.print("No");
	        }
	    }
}
