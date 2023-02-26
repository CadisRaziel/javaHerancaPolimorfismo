package Sobrescrita;

public class Corrente extends Conta{
    @Override
    public void exibirSaldo() {
        System.out.println("Sobrescrita na classe filha 'Corrente' ");
        System.out.println("metodo da classe Corrente herdando de conta\n");
    }
}
