
public class Queijo extends HamburguerDecorator {
	public Queijo (Hamburguer h) {
		super(h);
	}
	
	public String ingrediente() {
		return this.getHamburguer().ingrediente() + " + queijo";
	}
	
	public double valor() {
		return this.getHamburguer().valor() + 2;
	}
}