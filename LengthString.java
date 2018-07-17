import java.util.Scanner;
public class LengthString {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String b=sc.next();
	String c=sc.next();
	int d=b.length();
	int e=c.length();
	if(d>=e){
		System.out.println(b);
	}
	else{
		System.out.println(c);
	}
	}
}
