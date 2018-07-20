import java.util.Scanner;
public class Stringreverse {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b="";
	int i;
	String temp=a;
	for(i=a.length()-1;i>=0;i--){
		b+=a.charAt(i);
		}
	if(temp.equals(b)){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
