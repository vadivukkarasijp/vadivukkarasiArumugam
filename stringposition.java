import java.util.Scanner;
public class stringposition {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    String a=sc.next();
    int l=a.length();
    String c="",d=""; 
    char b[]=a.toCharArray();
    for(int i=0;i<a.length();i++){
    	if(i%2==0){
    		c+=b[i];
    	}
    	else{
    		d+=b[i];
    	}
    }
    System.out.print (c+" "+d);
    
}
}
