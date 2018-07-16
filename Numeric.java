import java.util.*;
class Numeric {
 public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int l=s.length();
    int i,count=0;
    char[] ch=new char[40];
    for(i=0;i<l;i++)
    {
    ch[i]=s.charAt(i);
    if(!(ch[i]>=65&&ch[i]<=92||ch[i]>=97&&ch[i]<=122))
    {
    	count++;
    }
    }
    if(count==l)
    {
        System.out.print("yes");
    }
    else{
        System.out.print("no");
    }
    sc.close();
}
}
