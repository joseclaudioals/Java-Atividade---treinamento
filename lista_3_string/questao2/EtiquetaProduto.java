package lista_3_string.questao2;

public class EtiquetaProduto {
    String nome;
    int quantidade;
    double precoUnit;

    EtiquetaProduto(String nome, int quantidade, double precoUnit){
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnit = precoUnit;
    }
    double total(){
        return quantidade*precoUnit;
    }
    String etiquetaSimples(){
        return String.format("NOME: %s\nPRECO= %.2f", nome, total());
    }
    String etiquetaCSV(){
        return String.format("%s; %d; %.2f; %.2f", nome, quantidade, precoUnit, total());
    }
    String etiquetaAlinhada(int larguraNome){
        String espacos="";
        for(int i=0; i<larguraNome; i++){
            espacos+=" ";
        }

        return String.format("%s%s(%dx%.2f) = R$%.2f",nome, espacos, quantidade, precoUnit, total());
    }
    String etiquetaJSON(){
        return String.format("{\"nome\":\"%s\",\"quantidade\": %d\",precoUnit\": %.2f, \"total\": %.2f}", nome, quantidade, precoUnit, total());
    }
}
