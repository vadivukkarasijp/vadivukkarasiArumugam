import java.util.Scanner;
public class oddcount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int b=0;
	int count=0;
	int a[]=new int[n];
	for(int i=0;i<n&& count<k;i++){
		a[i]=sc.nextInt();
		if(a[i]%2!=0){
			count++;
			b=a[i];
		}
	}
	System.out.println(b);
	
}
}
