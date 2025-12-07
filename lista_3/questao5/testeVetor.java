package questao5;

public class testeVetor {
    public static void main(String[]args){
        VetorEstatico v = new VetorEstatico(new double[]{1, 2, 3, 4, 5});

        System.out.println(""+v.soma());
        System.out.println(""+v.media());
        System.out.println(""+v.max());
        System.out.println(""+v.min());
        System.out.println(""+v.comoString());
    }
    
}
