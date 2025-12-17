package lista_2_objetos_e_classes.questao2;

public class Funcionario {
    String nome;
    int horasTrabalhadas;
    double valorHora;

    Funcionario(String nome, int horasTrabalhadas, double valorHora){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    Funcionario(){}

    double calcularSalario(){
        return this.valorHora*this.horasTrabalhadas;
    }
}
