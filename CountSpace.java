import java.util.Scanner;
public class CountSpace {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a="";
	a=sc.nextLine();
	String  b[]=a.split("\\s");
	int count=0;
	for(int i=0;i<b.length;i++){
		count++;
	}
	System.out.println(count-1);
}
}
