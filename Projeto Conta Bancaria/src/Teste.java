
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente c1 = new ContaCorrente("Annefrance");
		System.out.println("O nome do titular da conta �: " + c1.titular);

		ContaCorrente c2 = new ContaCorrente(45);
		System.out.println("O valor da conta da titular " + c1.titular + "� igual a " + c2.saldo);

		if (c1.depositaValor(50)) {
			System.out.println("Dep�sito para " + c1.titular + " realizado com SUCESSO!!");
		} else {
			System.out.println("Dep�sito para " + c1.titular + " N�O realizado!!");
		}

		System.out.println("O saldo da conta de " + c1.titular + " � igual a " + c1.getSaldo());

		if (c1.sacaConta(60)) {
			System.out.println("Saque realizado com SUCESSO! O saldo atual �: " + c1.saldo);
		} else {
			System.out.println("Saque realizado com N�O realizado! O saldo atual �: " + c1.saldo);
		}
		
		if(c2.transfereValor(c1, 10)) {
			System.out.println("Transfer�ncia realizada com SUCESSO!! Seu novo saldo �: " + c2.saldo);
		}else {
			System.out.println("Transfer�ncia N�O realizada!! O seu saldo continua: "+ c2.getSaldo());
		}
	}

}
