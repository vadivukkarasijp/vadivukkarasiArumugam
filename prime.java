 Scanner s=new Scanner(System.in);
		  int number;
		  number=s.nextInt();
		  int i,count=0;
		  for(i=2;i<=number;i++){
			  if(number%i==0){
				  count++;
			  }
		  }
			 if(count==1){
				 System.out.println("yes");
			 }
			 else{
				 System.out.println("not");
			}
