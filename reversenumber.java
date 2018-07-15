 Scanner s=new Scanner(System.in);
		  int number,temp=0;
		  number=s.nextInt();
		  temp=number;
		  int a=0,rev=0;
		  if(number>=1 &&number<=1000){
			 while(number!=0){
				 a=number%10;
				 number=number/10;
				 rev=rev*10+a;
				}
		 }
			 if(rev==temp){
				 System.out.println("yes");
			 }
			 else{
				 System.out.println("not");
			}
