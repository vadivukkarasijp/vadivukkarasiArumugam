import java.util.Scanner;
public class stringvowels.java{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	 String a=sc.nextLine();
	 char[]b={'a','e','i','o','u'};
	 String d="";
	 int count=0;
	 for(int i=0;i<a.length();i++){
		 if(a.charAt(i)==b[0]||a.charAt(i)==b[1]||a.charAt(i)==b[2] ||a.charAt(i)==b[3]|| a.charAt(i)==b[4]){
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
