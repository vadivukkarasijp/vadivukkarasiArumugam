 Scanner s=new Scanner(System.in);
		  int number,k;
		  number=s.nextInt();
		  k=s.nextInt();
		  int i,count=0;
		  if (k<=10000){
		  for(i=number+1;i<k;i++){
			if(i%2!=0){  
				System.out.print(i+" ");
			}
	}
		  }
