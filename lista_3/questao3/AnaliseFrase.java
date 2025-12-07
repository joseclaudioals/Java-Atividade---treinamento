package questao3;

public class AnaliseFrase {
    String frase;

    AnaliseFrase(String frase){
        this.frase=frase;
    }

    int contarVogais(){
        if(frase==null)
            return -1;

        int qntVogais=0;

        String fraseM = frase.toLowerCase();

        for(int i=0; i<frase.length(); i++){
            char c = fraseM.charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                qntVogais++;
            }
        }
        return qntVogais;
    }

    int contarPalavras(){
        String[] palavras = frase.split("\\s+");

        return palavras.length;
    }

    String inverteString(){
        String fraseInvertida="";

        for(int i=frase.length()-1; i>=0; i--){
            char tempC= frase.charAt(i);

            fraseInvertida = fraseInvertida + tempC;
        }

        return fraseInvertida;
    }

    boolean isPalindromo(){
        String fraseM="";
        frase=frase.toLowerCase().replaceAll("[^a-zA-Z]", "");
        String teste="";
        for(int i=fraseM.length(); i>=0; i--){
            teste=teste+frase.charAt(i);
        }
        if(frase.equals(fraseM))
            return true;
            else 
                return false;
    }
}
