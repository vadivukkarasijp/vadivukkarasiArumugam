import java.util.*;
public class hour{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		double a=0.0;
		if(n<60){
			System.out.println("0 "+(int)n);
		}
		else{
			a=(n/60);
			double b=a-(long)a;
			double c=b*60;
			System.out.println((int)a+" "+(int)c);
			}
}
}
