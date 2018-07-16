import java.util.Scanner;
public class guviThree {
public static void main(String[]args){
	  Scanner s=new Scanner(System.in);
	  int a,max=0;
	  a=s.nextInt();
	  int b[]=new int[a];
	  for(int i=0;i<a;i++){
		  b[i]=s.nextInt();
	  }
	  for(int i=0;i<a;i++){
		  for(int j=i+1;j<a;j++){
		  if(b[i]>b[j]){
			  max=b[i];
			  b[i]=b[j];
			  b[j]=max;
		  }
	  }
	 System.out.println(b[i]);
	  }
	s.close();
}
}
