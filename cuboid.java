import java.util.Scanner;
public class cuboid {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int l=2*((a*b)+(b*c)+(c*a));
	int v=a*b*c;
	System.out.println(l+" "+v);
}
}
