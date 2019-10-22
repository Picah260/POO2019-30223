
public class Mainclass {
public static String invert(String str)
{
	if(str==null)return null;
	String[] word=str.split(" ");
	
	int numar=0;
	for(String i:word) numar++;
	
	if(numar==4)
	return word[3]+ "," + word[2]+" "+ word[0]+ " "+word[1];

	if(numar==3)
		return word[2]+ "," + word[1]+" "+word[0];
	
	if(numar==2)
		return word[1]+ "," + word[0];
	if(numar==1)
		return word[0];	

	return null;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(invert("Mr. Phd. FirstName LastName "));
		System.out.println(invert("Mr. FirstName LastName"));
		System.out.println(invert("FirstName LastName"));
		System.out.println(invert("SingleWord"));
		System.out.println(invert(""));
		System.out.println(invert(null));

	}

}
