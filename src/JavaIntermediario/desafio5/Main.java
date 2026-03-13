package JavaIntermediario.desafio5;



public class Main {
    static void main(String[] args) {


        ContaPoupanca contaPoupanca = new ContaPoupanca(1000,TipoConta.POUPANCA);

        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(300);
        System.out.println("---------------------------------");

        ContaCorrente contaCorrente = new ContaCorrente(300,TipoConta.CORRENTE);
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(200);
        System.out.println("---------------------------------");
        BancoKonoha banco = new BancoKonoha();

        Conta conta1 = new ContaCorrente(500, TipoConta.CORRENTE);
        Conta conta2 = new ContaPoupanca(300, TipoConta.POUPANCA);

        banco.transferir(conta1, conta2, 100);

        conta1.consultarSaldo();
        conta2.consultarSaldo();



    }
}
