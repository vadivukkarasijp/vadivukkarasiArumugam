Scanner s=new Scanner(System.in);
		  int n,k;
		  n=s.nextInt();
		  k=s.nextInt();
		  int b=0;
		  int a[]=new int[n];
		  for(int i=0;i<n;i++){
			 a[i]=s.nextInt();
		  }
		  for(int i=0;i<k;i++){
			  b+=a[i];
		  }
		  System.out.println(b);
