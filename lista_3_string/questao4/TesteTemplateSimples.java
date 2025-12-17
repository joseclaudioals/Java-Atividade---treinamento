package lista_3_string.questao4;

public class TesteTemplateSimples {
    public static void main(String[]args){
        TemplateSimples t = new TemplateSimples("Cracha: \nNome: [nome]\nCidade: [cidade]\nIdade: [idade]");


        System.out.println("" + t.preencher("José", 9, "Parnaiba"));
        
    }
}
