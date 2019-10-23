
public class Mainclass12 {


	public static void main(String[] args) {
		int x=1;
		int y=2;
		int z=x+y;
		int suma=0;
		while(z<=4000000)
		{
			x=y;
			y=z;
			z=x+y;
			//System.out.println(z);
			if(z%2==0)
				suma+=z;
		}
		suma+=2;// la inceput
		System.out.println("Suma termeni pari este "+suma);
		
			
	
		// TODO Auto-generated method stub

	}

}
