import java.awt.Color;

public class Masina implements Cloneable {
	private String marca;
	private Color culoare;

	public Masina(String marca, Color culoare) {
		this.marca = marca;
		this.culoare = culoare;
	}

	public void setCuloare(Color culoare) {
		this.culoare = culoare;
	}

	public String getMarca() {
		return marca;
	}

	public Color getCuloare() {
		return culoare;
	}

	public Masina deepcoppy() {
		return new Masina(this.marca, this.culoare);
	}

	public Masina shallowcoppy() {
		return this;
	}

}
