 Scanner s=new Scanner(System.in);
		  int year;
		  year=s.nextInt();
		  if((year %4==0 && !(year%100==0))||((year%100==0) &&year%400==0)){
			  System.out.println("yes");
		  }
		  else
		  System.out.println("not");
