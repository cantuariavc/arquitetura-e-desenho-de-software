
public class Principal {

	public static void main(String[] args) {
		Hamburguer h = new Bacon(new Queijo(new HamburguerBase()));
		System.out.println("Ingredientes: " + h.ingrediente());
		System.out.println("Valor: "  + h.valor());
	}
}
