import java.util.Scanner;
public class capitalize {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b[]=a.split("\\s");
	for(int i=0;i<b.length;i++){
		b[i]=b[i].substring(0,1).toUpperCase()+b[i].substring(1);
		System.out.print(b[i]+" ");
		
	}}
}
