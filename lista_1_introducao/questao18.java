import java.util.Scanner;

public class questao18 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String sInicial="", sFinal="";

        System.out.println("- VERIFICADOR DE PALINDROMO -");
        System.out.println("insira uma frase para verifiação");
        sInicial = sc.nextLine();
        sInicial=sInicial.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        for(int i = 0; i<sInicial.length(); i++){
            sFinal = sInicial.charAt(i) + sFinal;
        }

        if(sInicial.equals(sFinal))
            System.out.println("a frase eh um palindromo");
            else 
                System.out.println("a palavra NAO eh um palindromo");
            sc.close();
    }
}
