package Sobrescrita;

public class Poupanca extends Conta{
    @Override
    public void exibirSaldo() {
        System.out.println("Sobrescrita na classe filha 'Poupanca' ");
        System.out.println("metodo da classe Poupanca herdando de conta\n");
    }
}
