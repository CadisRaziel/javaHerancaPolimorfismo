package Sobrescrita;

public class Main {
    public static void main(String[] args) {
        Conta[] conta = new Conta[]{new Corrente(), new Poupanca(), new Conta()};


        //vai percorrer as classes
        for (Conta contaMain: conta) {
            //vai chamar os metodos dentro dessas classe e printar
            contaMain.exibirSaldo();
        }

        Corrente corrente = new Corrente();
        corrente.exibirSaldo();
    }
}
