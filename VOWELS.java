 Scanner s=new Scanner(System.in);
	  char c=s.next().charAt(0); 
	  if((c=='a' ||c=='e'||c=='i' || c=='o' ||c=='u')||(c=='A' ||c=='E'||c=='I' || c=='O' ||c=='U')){ 
		  System.out.println("vowels"); 
		  }
	  else if((c>='b'&& c<='z' )||(c>='B' && c<'z')){
		  System.out.println("consonants");
		  }
	  else{
		  System.out.println("invalid input");
	  }
