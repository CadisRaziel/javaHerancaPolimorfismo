package VisibilidadeClasses;

public class Class3 {
    //nao herda nenhuma classe

    Class1 class1;//porém se chamar a classe1 consegue usar o public e protected pois ta no mesmo package

    void metodo(){
       String temAcessProtected = class1.atributoProtected;
       String temAcessoPublico = class1.atributoPublic;

       class1.metodoProtected();
       class1.metodoPublico();
    }
}
