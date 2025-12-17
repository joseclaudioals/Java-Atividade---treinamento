package lista_2_objetos_e_classes.questao3;

public class Quadrado {
    double lado;
    Quadrado(double lado){
        this.lado=lado;
    }
    double area(double lado){
        return Math.pow(lado,2);
    }
    double perimetro(double lado){
        return lado*4;
    }

}
