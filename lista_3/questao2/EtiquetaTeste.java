package questao2;

public class EtiquetaTeste{
    public static void main(String[]args){
        EtiquetaProduto p = new EtiquetaProduto("Caderno", 3, 17.5);

        System.out.printf("%s\n", p.etiquetaAlinhada(7));
        System.out.printf("%s\n", p.etiquetaCSV());
        System.out.printf("%s\n", p.etiquetaSimples());
        System.out.printf("%s\n", p.etiquetaJSON());
    }
}