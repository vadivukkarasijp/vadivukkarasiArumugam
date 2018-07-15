 Scanner s=new Scanner(System.in);
	  int n,count=0,sum=0,b=0;
	  int number,k;
	  number=s.nextInt();
	  k=s.nextInt();
	  for(int i=number;i<=k;i++){
          n = i;
          while(n > 0){
              b = n % 10;
              sum+=(int)Math.pow(b,3);
              n = n / 10;
          }
          if(sum==i){
          System.out.print(i);
          }
          sum = 0;
      }
