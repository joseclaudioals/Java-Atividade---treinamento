package lista_4.questao2;

public class Teste {
    public static void main(String[] args){
        Termostato t = new Termostato(0, 70, 30);

        t.showStatus();

        t.aumentarTemp();
        t.aumentarTemp();
        t.diminuirTemp();

        t.showStatus();
    }
    
}
