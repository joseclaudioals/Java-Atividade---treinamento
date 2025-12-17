package lista_4_encapsulamento.questao2;

public class Termostato {
    private int temperaturaAtual;
    private int temperaturaMin;
    private int temperaturaMax;

    public Termostato(int temperaturaAtual, int temperaturaMax, int temperaturaMin){
        this.temperaturaMax=temperaturaMax;
        this.temperaturaMin=temperaturaMin;
        setTemperatura(temperaturaAtual);
    }

    protected boolean ajustarTemperatura(int novaTemperatura){
        if(novaTemperatura>temperaturaMin && novaTemperatura<temperaturaMax){
            temperaturaAtual=novaTemperatura;
            
            return true;
        }

        return false;
    }
    protected void aumentarTemp(){
        if(temperaturaAtual<temperaturaMax){
            temperaturaAtual++;
            System.out.println("Temperatura aumentada");
            return;
        }
        System.out.println("Temperatura maxima atingida");
    }
    protected void diminuirTemp(){
        if(temperaturaAtual<temperaturaMin){
            temperaturaAtual--;
            System.out.println("Temperatura diminuida");
            return;
        }
        System.out.println("Temperatura minima atingida");
    }

    private void setTemperatura(int novaTemperatura){
        if(novaTemperatura>temperaturaMin && novaTemperatura<temperaturaMax
        ){
            temperaturaAtual = novaTemperatura;
            return;
        }

        novaTemperatura=(temperaturaMax-temperaturaMin)/2;
    }

    protected void showStatus(){
        System.out.printf("min = %d | atual = %d | max = %d\n", temperaturaMin, temperaturaAtual, temperaturaMax);
    }
}
