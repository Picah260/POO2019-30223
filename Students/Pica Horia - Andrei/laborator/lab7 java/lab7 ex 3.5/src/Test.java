import java.awt.Color;

public class Test {

	public static void main(String[] args) {
		Masina m = new Masina("Ford Focus RS", Color.BLUE);
		Student student = new Student("Pica", "Horia", m);
		Student student1 = student.deepcoppy();
		student1.getM().setCuloare(Color.red);
		System.out.println(student.getNume() + " " + student.getPrenume() + " " + student.getM().getCuloare());
		System.out.println(student1.getNume() + " " + student1.getPrenume() + " " + student1.getM().getCuloare());
		Student student2 = student.shallowcoppy();
		student2.getM().setCuloare(Color.green);
		System.out.println(student.getNume() + " " + student.getPrenume() + " " + student.getM().getCuloare());
		System.out.println(student2.getNume() + " " + student2.getPrenume() + " " + student2.getM().getCuloare());

	}

}
