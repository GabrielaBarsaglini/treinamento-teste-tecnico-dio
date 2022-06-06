package exercicios.treinamento;

import exercicios.treinamento.funcionario.Consultor;
import exercicios.treinamento.funcionario.Vendedor;

public class Main {
    public static void main(String[] args) {

        //NumeroReverso.numeroReverso();

        //criação de dois objetos macacos
        /*Macaco macaco1 = new Macaco();
        Macaco macaco2 = new Macaco();

        macaco1.comer("banana");
        macaco1.comer("banana");
        macaco1.comer("banana");

        macaco2.comer("pera");
        macaco2.comer("uva");
        macaco2.comer("maca");

        macaco1.digerir();
        macaco2.digerir();
         */

        Vendedor vendedor = new Vendedor("Camila",123456789l,10d,5);
        System.out.println(vendedor.calcularSalario());

        Consultor consultor = new Consultor("Consultor",789456123l, 100.5d,10);
        System.out.println(consultor.calcularSalario());
    }
}