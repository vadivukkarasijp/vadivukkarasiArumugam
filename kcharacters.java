import java.util.Scanner;
public class kcharacters {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	int k=sc.nextInt();
	System.out.println(a.substring(0,k));
}
}
