public class Mainclass {

	public static void main(String[] args) {
		System.out.println("Numerele sunt");
		int viz[]=new int[50];
		int nr=0;
		for(int i=1;i<=49;i++)
			viz[i]=0;
		for(int i=0;i<6&&nr<6;i++)
		{
			
		
		double y=Math.random()*100;
		int x=(int)y;
		x=x%50;
		viz[x]++;
		
		if(viz[x]==1)
		{
			nr++;
			System.out.println(x);

		}

		}
		
		
		// TODO Auto-generated method stub

	}

}
