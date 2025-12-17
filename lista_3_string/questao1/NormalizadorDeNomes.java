package lista_3_string.questao1;
public class NormalizadorDeNomes{
    String original;
    NormalizadorDeNomes(String original){
        this.original = original;
    }    
    String somenteUmaEspaco(){
        return original.trim().replaceAll("\\s+"," ");
    }
    String capitalizar(){
        String[] vetorTemp = original.split("\\s+");
        for(int i = 0; i<original.length(); i++){
            vetorTemp[i] = Character.toUpperCase(vetorTemp[i].charAt(0)) + vetorTemp[i].substring(i);
            return String.join("", vetorTemp);
        }
    }
}