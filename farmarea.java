import java.util.Scanner;
public class farmarea{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	float a= sc.nextFloat();
	float b=sc.nextFloat();
	float c=a*b;
	String d=String.format("%.5f",c);
	System.out.println(d);
	
}
}
