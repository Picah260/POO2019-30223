public class Pol {
	public int[] a;
	public int grade;

	Pol(int[] a, int grade) {
		this.grade = grade;
		this.a = new int[grade];
		for (int i = 0; i < grade; i++)
			this.a[i] = a[i];

	}

	Pol(int grade) {
		this.grade = grade;
		this.a = new int[grade];
		for (int i = 0; i < grade; i++)
			this.a[i] = 0;
	}

	public static void afisare(Pol p1) {
		System.out.printf("Polinomul de grad %d este : = ", p1.grade - 1);
		for (int i = p1.grade - 1; i >= 0; i--) {
			if (p1.a[i] >= 0 && i != p1.grade - 1)
				System.out.printf("+");

			System.out.printf("%dx^%d ", p1.a[i], i);

		}
		System.out.println(" ");

	}

	public static Pol add(Pol p1, Pol p2) {
	
		Pol rez = new Pol(Math.max(p1.grade, p2.grade));
		if (p1.grade > p2.grade) {
			for (int i = p1.grade - 1; i >= 0; i--)
				rez.a[i] = p1.a[i];
			for (int i = p2.grade - 1; i >= 0; i--)
				rez.a[i] += p2.a[i];
		} else {

			for (int i = p2.grade - 1; i >= 0; i--)
				rez.a[i] = p2.a[i];
			for (int i = p1.grade - 1; i >= 0; i--)
				rez.a[i] += p1.a[i];

		}
		return rez;

	}
	
	public static Pol subtract(Pol p1, Pol p2) {
		
		Pol rez = new Pol(Math.max(p1.grade, p2.grade));
		if (p1.grade > p2.grade) {
			for (int i = p1.grade - 1; i >= 0; i--)
				rez.a[i] = p1.a[i];
			for (int i = p2.grade - 1; i >= 0; i--)
				rez.a[i] -= p2.a[i];
		} else {

			for (int i = p2.grade - 1; i >= 0; i--)
				rez.a[i] = p2.a[i];
			for (int i = p1.grade - 1; i >= 0; i--)
				rez.a[i] -= p1.a[i];

		}
		return rez;

	}
	public static Pol multiply_scalar(Pol p1, int scalar) {
		
		Pol rez = new Pol(p1.grade);
		
			for (int i = p1.grade - 1; i >= 0; i--)
				rez.a[i] =p1.a[i]*scalar;
			
		
		
		return rez;

	}
	public static Pol multiply(Pol p1,Pol p2)
	{
		Pol rez=new Pol(p1.grade+p2.grade-1);
		for(int i=p1.grade-1;i>=0;i--)
			for(int j=p2.grade-1;j>=0;j--)
			{
				rez.a[i+j]=p1.a[i]*p2.a[j];
			}
		return rez;
	}
	public static double rezultat(Pol p1,int x)
	{
		double rez=0;
		for(int i=p1.grade-1;i>=0;i--)
		{
			rez+=p1.a[i]*Math.pow(x, i);
		}
		return rez;
	}

	public static void main(String[] args) {
		Pol p1, p2;
		p1 = new Pol(new int[] { -1, 0, 1, -2 }, 4);
		p2 = new Pol(new int[] { -7, 0, 3 }, 3);
		afisare(p1);
		afisare(p2);
		Pol suma=add(p1,p2);
		afisare(suma);
		Pol minus=subtract(p1,p2);
		afisare(minus);
		Pol scal=multiply_scalar(p1,10);
		afisare(scal);
		Pol multipe=multiply(p1,p2);
		afisare(multipe);
		double rez=rezultat(p1,5);
		System.out.println(rez);


	}

}
