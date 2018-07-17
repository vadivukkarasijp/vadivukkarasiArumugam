import java.util.Scanner;
public class maximumnumber {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	int max=0;
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}
	max=a[0];
	for(int i=1;i<a.length;i++){
		if(max<a[i]){
			max=a[i];
		}
	}
System.out.println(max);
}
}
