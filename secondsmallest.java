import java.util.Scanner;
public class secondsmallest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int i,j;
	int a[]=new int[n];
	for(i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	int temp=0,count=0;
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	count++;
	if(count==k){
		System.out.println(a[i]);
	}
	}
	
}
}
