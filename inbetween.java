import java.util.Scanner;
public class inbetween{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	 int l=sc.nextInt();
	 int m=sc.nextInt();
	 int count=0;
	 String d="";
	 for(int i=l;i<m;i++){
		 if(i==a){
			 d="yes";
			 count++;
		 }
		 else if(count==0){
			 d="no";
		 }
}
	 System.out.println(d);
}
}
