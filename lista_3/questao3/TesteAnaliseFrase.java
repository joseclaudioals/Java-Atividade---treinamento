package questao3;

public class TesteAnaliseFrase {
    public static void main(String[]args){
        AnaliseFrase s = new AnaliseFrase("abacate eh legal");

        System.out.println("" + s.contarVogais());
        System.out.println("" + s.contarPalavras());
        System.out.println("" + s.inverteString());
        System.out.println("" + s.isPalindromo());
    }
}
