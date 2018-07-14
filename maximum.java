 Scanner s=new Scanner(System.in);
	  int a[]=new int[3];
	  int max=0;
	  for(int i=0;i<3;i++){
		  a[i]=s.nextInt();
	  }
	  for(int i=0;i<3;i++){
		  max=a[0];
		  if(max<a[2])
			max=a[2];  
		  else if(max<a[1])
			  max=a[1];
	}
	  System.out.println(max);
