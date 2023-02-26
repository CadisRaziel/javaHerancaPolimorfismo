package Sobrescrita;

public class Conta {
    private double saldo;

    //a conta corrente e a universitaria pode nao ter essa função 'exibirSaldo'
    //ou seja elas não sobreescreveram o metodo exibirSaldo
    //Sobrescrita -> utilizar essa função porém colocar algo a mais nela
    //ou seja eu posso na classe 'poupanca' e sobreescrever o metodo exibirSaldo e colocar um calculo de juros nele.
    public void exibirSaldo(){}

}
