import java.util.ArrayList;

public class PetHotel {
	private int nrroom;
	private boolean[] isRoomFree;
	private ArrayList<Pet> listaCaini;

	public PetHotel(int nrroom) {
		this.nrroom = nrroom;
		this.listaCaini = new ArrayList<Pet>();
		this.isRoomFree=new boolean[nrroom];
		for(int i=0;i<nrroom;i++)
		{
			listaCaini.add(new Pet());
			isRoomFree[i]=true;
		}
	}

	void addCaine(Pet p, int room) {
	    listaCaini.add(room, p);
		isRoomFree[room] = false;

	}

	void stergeCaine(Pet p, int room) {
		listaCaini.remove(p);
		isRoomFree[room] = true;
	}

	void printCaine() {
		
		for ( int i=0;i <nrroom;i++) {
			System.out.println("camera "+ i);
			System.out.println(listaCaini.get(i));
			
		}
	}

}
