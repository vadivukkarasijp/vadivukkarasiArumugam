  Scanner s=new Scanner(System.in);
		  int number,temp=0;
		  number=s.nextInt();
		  temp=number;
		  int a=0,b=0;
		  while(number!=0){
			  a=number%10;
			  number=number/10;
			 b+=(int)Math.pow(a,3);
		  }
		  if(b==temp){
			  System.out.println("yes");
		  }
		  else{
			  System.out.println("no");
		  }
