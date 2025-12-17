import java.util.Scanner;

public class questao19 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int dia, mes, ano;
        System.out.println("- VALIDADOR DE DATAS -");
        System.out.println("insira um dia");
        dia = sc.nextInt();

        System.out.println("insira um mes");
        mes = sc.nextInt();

        System.out.println("insira um ano");
        ano = sc.nextInt();
        
        boolean verificador=true;

        if(mes<=0 && mes>12 || dia<=0 && dia>31 || ano<0)
            verificador = false;
            else if((mes == 4 || mes == 6 || mes == 9 || mes == 11)&&dia>30)
                verificador = false;
        if(mes == 2){
            // verificação se um mes eh bissexto == (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)
            if(((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) && dia>29)
                verificador = false;
                else if(!((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0))&& dia>28)
                    verificador = false;
        }

        if(verificador)
            System.out.println("valido");
            else 
                System.out.println("invalido");
        sc.close();
    }
}
