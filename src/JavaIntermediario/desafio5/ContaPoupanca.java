package JavaIntermediario.desafio5;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();


    }

    @Override
    public void depositar(double valor) {
        System.out.println("seu saldo com o deposito é de");
        System.out.println(saldo += valor *0.99);

    }

}
