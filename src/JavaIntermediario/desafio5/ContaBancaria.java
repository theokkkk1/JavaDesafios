package JavaIntermediario.desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    @Override
    public abstract void depositar(double valor) ;

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é de "+ saldo);
    }


}
