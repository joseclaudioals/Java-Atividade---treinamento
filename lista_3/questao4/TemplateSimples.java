package questao4;

public class TemplateSimples {
    String template;

    TemplateSimples(String template){
        this.template = template;
    }
    
    String preencher(String nome, int idade, String cidade){

        String temp = this.template;

        if(nome==null || nome=="")
            temp=temp.replace("[nome]", "Visitante");          
            else 
                temp=temp.replace("[nome]", nome);

        String idadeS = Integer.toString(idade);

        if(idade<=0)
            temp=temp.replace("[idade]", "Desconhecido");
            else 
                temp=temp.replace("[idade]", idadeS);

        if(cidade==null || cidade=="")
            temp=temp.replace("[cidade]", "Desconhecido");
            else 
                temp=temp.replace("[cidade]", cidade);

        return temp;
    }
}
