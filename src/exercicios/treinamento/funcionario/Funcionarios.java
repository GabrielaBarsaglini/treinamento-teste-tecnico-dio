package exercicios.treinamento.funcionario;
/*
Considerando o diagrama abaixo, feito para uma empresa de vendas. Nesse contexto, utilize o conceito de
Herança para remodelá-la e implemente um programa que explore o domínio em questão:

Regras:
a)Crie uma classe mãe chamada Funcionario com os atributos nome,cpf(passados pelo construtor), uma
constante para armazenar o valor do salário mínimo e um método abstrato"calcularSalario';
b)Vendedores ganham 1 salário mínimo, mas uma comissão por vendas;
c)Consultores ganham somente pelas horas que trabalharam;
 */

public abstract class Funcionarios {
    private String nome;
    private long cpf;
    protected final Double SALARIO_MINIMO = 1000.0;

    public Funcionarios(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularSalario();

    protected double getSALARIO_MINIMO() {
        return 0;
    }
}
