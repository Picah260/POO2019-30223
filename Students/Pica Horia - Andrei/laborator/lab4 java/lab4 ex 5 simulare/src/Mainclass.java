import java.util.Random;
public class Mainclass {

	public static void main(String[] args) {
		Random rand=new Random();
		int ran;
		System.out.println("Numerele generate sunt : ");
		for(int i=0;i<6;i++)
			{
			ran=rand.nextInt(49)+1;
			
			System.out.println(ran);
			}
		
		// TODO Auto-generated method stub

	}

}
