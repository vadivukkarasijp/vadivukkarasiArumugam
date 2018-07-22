import java.util.Scanner;
public class odddigits {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int i=1;
	int b[]=new int[a];
	 while(a!=0){
		 b[i]=a%10;
		 a/=10;
		 i++;
	 }
	 for(int j=i;j>0;j--){
		 if(j%2!=0){
			 System.out.println(b[j]);
		 }
	 }
}
}
