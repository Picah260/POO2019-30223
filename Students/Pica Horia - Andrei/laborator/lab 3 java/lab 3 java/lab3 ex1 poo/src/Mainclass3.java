public class Mainclass3
{ 
public static boolean test_isprime(int x) 	
{ 	 if(x==0) 	 return false; 	
else 	 for(int i=2; i<=x/2; i++) 
	if(x%i==0)
		return false; 
    if(x==1) 	
		return true; 	
	return true; 	
}

public static void main(String[] args) {
	int number,m,n; 		
	int nr=0; 		
	m=0; 		
	n=99; 	 
	for(number=m; number<=n; number++) 	 
	   {
		if(number%2==0) 	 
	     { 	 for(int z=0; z<=number; z++) 
	     { 	 for(int z1=0; z1<=number; z1++) 	 
		     if(z+z1==number&&test_isprime(z)==true&&test_isprime(z1)==true) 
		{ 	 	nr++;
		System.out.println(number+"="+z+"+"+z1); 	
		//z=number+1; 	
		//z1=number+1; 	 
		} 	 
	       }
	     }
	} 	
	System.out.println("Numarul este : = "+nr); 
	// TODO Auto-generated method stub 	} }
		}
}
