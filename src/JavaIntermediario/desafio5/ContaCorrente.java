package JavaIntermediario.desafio5;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();


    }

    @Override
    public void depositar(double valor) {
        System.out.println("seu saldo com o deposito é de");
        System.out.println(saldo += valor);

    }
}
