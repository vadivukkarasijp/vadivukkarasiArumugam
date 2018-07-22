import java.util.Scanner;
public class isogram {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    String a=sc.next();
    char b[]=a.toCharArray();
     int i=0;
     String d="";
     int count=0;
     for(i=0;i<b.length;i++){
    	 for(int j=i+1;j<b.length;j++){
    	 if(b[i]==b[j]){
    		 d="no";
    		 count++;
    	 }
    	 else if(count==0){
    		 d="yes";
    	 }
     }
     }
     System.out.println(d);
    
}
}
