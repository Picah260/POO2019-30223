package palindrom;

public class Mainclass {
	public static boolean palindrom(long x)
	{
		long o=0;
		long x1=x;
		while(x!=0)
			{
			o=o*10+x%10;
			x=x/10;
			}
		if(o==x1)
			return true;
		return false;
		
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		long  max4=0;
		int max2=0;
		for(int i=100;i<=999;i++)
			for(int j=100;j<=999;j++)
				if(i*j>max&& palindrom(i*j)==true)
					
					max=i*j;
					
		System.out.println("Maximul este "+ max);
		for(int i=1000;i<=9999;i++)
			for(int j=1000;j<=9999;j++)
				if(i*j>max4&& palindrom(i*j)==true)
					
					max4=i*j;
		System.out.println("Maxim de 4 cifre"+max4);
		for(int i=10;i<=99;i++)
			for(int j=10;j<=99;j++)
				if(i*j>max2&& palindrom(i*j)==true)
					
					max2=i*j;
		System.out.println("Maxim de 2 cifre"+max2);
	

	}
	

}
