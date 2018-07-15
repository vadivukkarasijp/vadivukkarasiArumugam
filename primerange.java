	  Scanner s=new Scanner(System.in);
		  int number,k;
		  number=s.nextInt();
		  k=s.nextInt();
		  int i,count=0;
		  for(i=number+1;i<k;i++){
			  count=0;
			  for(int j=2;j<k;j++)
			if(i%j==0 ){
				count++;
			}
			if(count==1){
			  System.out.print(i+" ");
		  }
		  }		  
