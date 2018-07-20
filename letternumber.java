import java.util.Scanner;
public class letternumber {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	String b[]={"one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	System.out.println(b[a-1]);
}
}
