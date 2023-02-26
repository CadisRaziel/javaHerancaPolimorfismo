package HerancaSimples;

public class Main {
    public static void main(String[] args) {
        //fazendo upcast (estou transformando o carro em VEICULO)
        Veiculo a = new Carro();
        System.out.println(a);

        //fazendo downcast (pego a mae e transformo na filha(não é muito usado e é muito perigoso)
        Carro b = (Carro) new Veiculo();
        System.out.println(b);
    }
}
