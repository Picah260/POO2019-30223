
public class Ghiozdan {
private Rechizite[] list;
private int nr;//nr de rechizite

public Ghiozdan() 
{
	this.list=new Rechizite[100];

}
void addCaiet(Caiet c)
{
	nr++;
	list[nr]=c;
	
}
void addManual(Manual m)
{
	nr++;
	list[nr]=m;
}
void listItemes()
{
	for(int i=1;i<=nr;i++)
	{
		System.out.println(list[i].getNume());
	}
		
}
void listManual()
{
	for(int i=1;i<=nr;i++)
	{
		if(list[i] instanceof Manual )
		System.out.println(list[i].getNume());
	}
}
void listCaiet()
{
	for(int i=1;i<=nr;i++)
	{
		if(list[i] instanceof Caiet )
		System.out.println(list[i].getNume());
	}
}
int getNrRechizite()
{
	return nr;
	
}
int getNrManual()
{
	int nrm=0;
	for(int i=1;i<=nr;i++)
	{
		if(list[i] instanceof Manual)
			nrm++;
		
	}
	return nrm;
	
}
int getNrCaiet()
{
	int nrc=0;
	for(int i=1;i<=nr;i++)
	{
		if(list[i] instanceof Caiet)
			nrc++;
		
	}
	return nrc;
	
}


}
