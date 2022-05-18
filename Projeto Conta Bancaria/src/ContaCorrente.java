public class ContaCorrente {
	String titular;
	double saldo;

	ContaCorrente(String titular) {
		this.titular = titular;
	}

	ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	double getSaldo() {
		return this.saldo;
	}

	boolean depositaValor(double valor) {
		if (valor > 0) {
			this.saldo = saldo + valor;
			return true;
		} else {
			return false;
		}

	}

	boolean sacaConta(double valor) {
		if (this.saldo > 0 && this.saldo > valor) {
			this.saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	boolean transfereValor(ContaCorrente destino, double valor) {
		if (this.sacaConta(valor) && destino.depositaValor(valor)) {
			return true;
		} else {
			return false;
		}
	}
	
}
