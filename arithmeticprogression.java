  
  import java.util.Scanner;
  class AP{
  public static void main(String[]args){
  Scanner s=new Scanner(System.in);
	  int n,a,d;
	  n=s.nextInt();
	  a=s.nextInt();
	  d=s.nextInt();
	  int b=(n*((2*a)+((n-1)*d)))/2;
	System.out.println(b);
  s.close();
  }
}
