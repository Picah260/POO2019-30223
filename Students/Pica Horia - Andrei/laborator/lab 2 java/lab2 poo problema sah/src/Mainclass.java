import java.math.BigInteger;
public class Mainclass {


	public static void main(String[] args) {
	BigInteger suma;
	BigInteger p  ;
	BigInteger p1 ;
	
	p = BigInteger.valueOf(1);
	suma=BigInteger.valueOf(0);
	p1=BigInteger.valueOf(2); 
	
	for(int i=1;i<=64;i++)
	{
		suma=suma.add(p);
		p=p.multiply(BigInteger.valueOf(2));
		
	
	}
	System.out.println(suma);

		

	}

}
