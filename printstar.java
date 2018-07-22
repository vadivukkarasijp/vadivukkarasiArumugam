import java.util.Scanner;
public class printstar{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	int z=a.length();
	if(a.length()%2==0){
		String b=a.substring((z/2)-1,(z/2)+1);
		b="**";
		String c=a.substring(0,(z/2)-1);
		String d=a.substring((z/2)+1,a.length());
		System.out.println(c+b+d);
		
	}
	else{
		String b=a.substring(z/2,(z/2)+1);
		b="*";
		String c=a.substring(0,z/2);
		String d=a.substring((z/2)+1,a.length());
				System.out.println(c+b+d);
	}
	
	}

}
