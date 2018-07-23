import java.util.Scanner;
public class arraysum {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b[]=new int[a];
	int c=0;
	for(int i=0;i<b.length;i++){
		b[i]=sc.nextInt();
	}
	for(int i=0;i<b.length;i++){
		c+=b[i];
	}
	System.out.println(c);
}
}
