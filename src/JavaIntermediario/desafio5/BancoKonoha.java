package JavaIntermediario.desafio5;

public class BancoKonoha {
    public void transferir(Conta origem, Conta destino,double valor){
        origem.depositar(-valor);
        destino.depositar(valor);
    }
    public void transferir(Conta origem, Conta destino) {
        double valorPadrao = 50;
        transferir(origem, destino, valorPadrao);
    }


}
