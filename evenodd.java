int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a>=1 && a<=100000){
			if(a%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
	}
		else
		System.out.println("Invalid input");	
