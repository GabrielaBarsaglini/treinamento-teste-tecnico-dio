package exercicios.treinamento.funcionario;

public class Consultor extends Funcionarios {
    private double valorHora;

    public Consultor(String nome, long cpf, double valorHora, long horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    private long horasTrabalhadas;

    public Consultor(String nome, long cpf) {
        super(nome, cpf);
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public long getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(long horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
