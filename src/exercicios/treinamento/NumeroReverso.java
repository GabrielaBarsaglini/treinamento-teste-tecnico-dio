package exercicios.treinamento;
/*
Faça um programa que leia um valor inteiro( este número deve conter 4 digitos). A saída deverá
ser o reverso de um número inteiro informado.

Regras:
1- O número informado deverá estar entre 1000 e 9999
2 - Se o usuário digitar 3 digitos ou menos, o programa deve avisar que
 tem que conter 4 digitos e continuar a programação até a resposta final
 */

import java.util.Scanner;

public class NumeroReverso {
    // criação do método abaixo, para poder chamar as entradas atraves do teclado
    //  porque ele deve ser criado fora do método main? os metodos devem ser criados um for ado outro?
    public static void numeroReverso() {

        // Classe Scanner
        // Para usá-la precisa importar java.util.Sacanner
        // Ela serve para perguntar no console
        // Como está  abaixo foi feita a criação de um objeto com a classe Scanner
        // o System.in dentro é um  parâmetro dentro do construtor

        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("Informe um número: ");
            // quando chama scan.nextInt(), está executando o métododo
            //do objeto que foi criado

            int numero = scan.nextInt();

            // não é possivel mostrar o inverso de um número em java
            // isso só é possivel com strings
            //por isso precismaos de um método que transfrome a variavel int em string
            // como feito abaixo ( isso aqui é o pulo do gato do exercicio)

            String numeroString = String.valueOf(numero);
            if (numero >= 1000 && numero <= 9999) ;
            {

                // o string builder esta dentro de macete de trasnformar o numero em string

                StringBuilder stringBuilder = new StringBuilder(numeroString);
                System.out.println(stringBuilder.reverse());
                break;
            }
        }while (true) ;
        }
    }



