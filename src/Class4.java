import VisibilidadeClasses.Class1;

public class Class4 {

    //essa pasta esta fora do package 'VisibilidadeClasses'
    //ou seja só vai ter acesso aos metodos e atributos publico
    Class1 class1;
    void metodo(){
       String temAcessoPublic = class1.atributoPublic;
       class1.metodoPublico();
    }
}
