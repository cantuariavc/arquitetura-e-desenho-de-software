
public abstract class HamburguerDecorator implements Hamburguer {
	private Hamburguer h;
	
	public HamburguerDecorator(Hamburguer h) {
		this.h = h;
	}
	
	public Hamburguer getHamburguer() {
		return h;
	}
}
