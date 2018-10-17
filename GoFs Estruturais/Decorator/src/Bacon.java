
public class Bacon extends HamburguerDecorator {
	public Bacon(Hamburguer h) {
		super(h);
	}
	
	public String ingrediente() {
		return this.getHamburguer().ingrediente() + " + bacon";
	}
	
	public double valor() {
		return this.getHamburguer().valor() + 3;
	}
}
