import java.util.*;
public class Hoursub{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
	    int hour1=sc.nextInt();
	    int min1=sc.nextInt();
        int hour2=sc.nextInt();
        int min2=sc.nextInt();
        System.out.println(Math.abs(hour1-hour2)+" "+Math.abs(min1-min2));
 
       }
}
