
public class TestFacebook {

	public static void main(String[] args) {
	
	FacebookAccount f=new FacebookAccount("Pica Horia",20,"Fagaras");
	FacebookAccount f1=new FacebookAccount("Kudichi o carina",5,"Sighet");
	FacebookAccount f2=new FacebookAccount("Pica Adina",42,"Fagaras");
	FacebookAccount f3=new FacebookAccount("Mama dolores",52,"Sighet");
	FacebookAccount f4=new FacebookAccount("Ghita",50,"Cluj");
	FacebookAccount f5=new FacebookAccount("Gheorghe",56,"Bucuresti");
	FacebookAccount f6=new FacebookAccount("George",18,"Brasov");
	FacebookAccount f7=new FacebookAccount("Mama",15,"Fagaras");
	FacebookAccount f8=new FacebookAccount("Horia",25,"Fagaras");
	FacebookAccount f9=new FacebookAccount("Silviu",35,"Fagaras");
	f.adaugaPrieten(f1);
	f.adaugaPrieten(f2);
	f.adaugaPrieten(f3);
	f.adaugaPrieten(f4);
	f1.adaugaPrieten(f2);
	f.adaugaPrieten(f5);
	f.adaugaPrieten(f6);
	f.adaugaPrieten(f7);
	f.adaugaPrieten(f8);
	f.adaugaPrieten(f9);
	f.printList();
	System.out.println("Prietenii gasiti sunt : = ");
	System.out.println(f.GasestePrietenii());
	

	}

}
