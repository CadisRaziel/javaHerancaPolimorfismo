package HerancaSimples;

public class Main {
    public static void main(String[] args) {
        //fazendo upcast (estou transformando o carro em VEICULO)
        //os mesmos dados que tem no carro tem no veiculo
        Veiculo a = new Carro();
        System.out.println(a);

        //fazendo downcast (pego a mae e transformo na filha(não é muito usado e é muito perigoso)
        //aqui vai da erro porque veiculo tem coisas que o carro nao tem
        //exemplo a classe filho carro tem coisas que a classe veiculo nao tem
        //entao o java nao sabe o que fazer
        Carro b = (Carro) new Veiculo();
        System.out.println(b);
    }
}
