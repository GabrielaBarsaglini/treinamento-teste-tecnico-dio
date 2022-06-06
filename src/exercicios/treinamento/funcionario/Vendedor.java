package exercicios.treinamento.funcionario;

// vendedor esta extendendo de funcionário, logo vendedor é filha de funcionario
// isso é um exemplo de utilização de herança
// no consultor acontece a mesma coisa, consultor é filhoo de funcionario
public class Vendedor  extends Funcionarios{
    private double comissao;
    private long numeroVendedas;

    public Vendedor(String nome, long cpf, double comissao, long numeroVendedas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroVendedas = numeroVendedas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public long getNumeroVendedas() {
        return numeroVendedas;
    }

    public void setNumeroVendedas(long numeroVendedas) {
        this.numeroVendedas = numeroVendedas;
    }

    @Override
    public double calcularSalario() {
        return super.getSALARIO_MINIMO() + (this.comissao * this.numeroVendedas);
    }
}

