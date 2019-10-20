import java.lang.Math; 
public class Mainclass {


public static void main(String args[])
{
	double  epsilon=0.0000001;//f(x)=ax^2+bx+c
	int a=1;
	int b=-3;
	int c=2;
	int x0=1;
	int n=1;
	int derivata=a*2*x0+b;
	int functie=a*x0*x0+b*x0+c;
	int x1=x0-(functie/derivata);
	while(Math.abs(x1-x0)*(x1-x0)>=epsilon)
	{
		n++;
		x0=x1;
		derivata=a*2*x0+b;
		functie=a*x0*x0+b*x0+c;
	    x1=x0-(functie/derivata);
		
	}
	System.out.println("Var sunt "+x1+"si"+x0);
	System.out.println(n);
	
}


}
