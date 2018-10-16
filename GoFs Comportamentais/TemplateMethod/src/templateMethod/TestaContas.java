package templateMethod;

public class TestaContas {

	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		
		contaCorrente.deposita(100);
		contaCorrente.saca(10);
		contaCorrente.saca(contaCorrente.calculaTaxa());
		
		contaPoupanca.deposita(100);
		contaPoupanca.saca(10);
		contaPoupanca.saca(contaPoupanca.calculaTaxa());
		
		System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
		System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
	}

}
