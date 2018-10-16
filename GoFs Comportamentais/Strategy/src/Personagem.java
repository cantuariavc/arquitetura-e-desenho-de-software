
public class Personagem {
	private int vida;
	
	public void recebeDano(Monstro monstro) {
		this.vida -= monstro.causaDano();
	}
}
