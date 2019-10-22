
public class Mainclass {

	public static void main(String[] args) {
		 String str = "HORIAREPERE";
	        int vocalsCount = 0, ConsonCount = 0;

	        //converting all the chars to lowercase
	        str = str.toLowerCase();
	        for(int i = 0; i < str.length(); i++) { 
	        char ch = str.charAt(i); 
	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { vocalsCount++; }
	        else if((ch >= 'a'&& ch <= 'z')) 
	        {
	                ConsonCount++;
	            }
	        }
	        System.out.println("Number of Vocals: " + vocalsCount);
	        System.out.println("Number of Conson: " + ConsonCount);
		// TODO Auto-generated method stub

	}

}
