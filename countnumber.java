 Scanner s=new Scanner(System.in);
		  int number;
		  int count=0;
		  number=s.nextInt();
		 while(number!=0){
			number=number/10;
			count++;
		 }
		 System.out.println(count);
