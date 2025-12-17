package lista_3_string.questao5;
import java.util.Arrays;

public class VetorEstatico {
    double[] dados;

    VetorEstatico(double[] dados){
        this.dados = dados;
    }

    double soma(){
        double somaTotal=0;
        for(int i=0; i<dados.length; i++){
            somaTotal+=dados[i];
        }

        return somaTotal;
    }

    double media(){
        double media = soma() /dados.length;

        return media;
    }

    double max(){
        double max=dados[0];
        for(int i=1; i<dados.length; i++){
            if(max<dados[i])
                max = dados[i];
        }

        return max;
    }

    double min(){
        double min=dados[0];
        for(int i=1; i<dados.length; i++){
            if(min>dados[i])
                min = dados[i];
        }

        return min;
    }

    String comoString(){
        return Arrays.toString(dados);
    }
}
