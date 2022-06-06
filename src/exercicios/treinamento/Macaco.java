package exercicios.treinamento;
/*
Classe Macaco:
Faça um programa e teste interativamente uma classe que modele um macaco
com os atributos "nome" e "bucho" (estômago) e os métodos "comer", "verBucho" e "digerir".
Regras:
a) Crie 2 macacos;
b) Considere que a quantidade máxima de alimentos é 3,
com isso lembre-se de verificar o conteúdo do estômago a cada refeição(método "comer")
Por fim, o método "digerir" deve esvaziar o bucho do Macaco;
c) Alimentos "digeriveis" devem ser do tipo String, garanta isso em seu código para que não haja nenhum macaco canibal;
 */

import java.util.ArrayList;
import java.util.List;

public class Macaco {

     private String nome;
     private static List<String> bucho =new ArrayList<>();

     //metodos
    public void comer(String comida) {
        //o metodo size retorna a quantidade de alimentos dentro da lista que foi chamada
        if (bucho.size() == 3) {
            System.out.println("Bucho cheio!");
        } else {
            // o metodo add vem de List e permite que adicione elementos dentro da lista
            // note que iniciamos a lista vazia
            bucho.add(comida);
        }
        //imprimir o que tem na barriga do macaco
        System.out.println(bucho);
    }
        // esse metodo não recebe nenhum argumento porque quando chegar nele ele tem que digrir
    public static void digerir(){
        // esse metodo é de List também, e verifica se a lista que foi passada esta vazia
        if(bucho.isEmpty()){
        System.out.println("Buchi vazio!");
        } else{
            bucho.remove(bucho.get(0));
        }
        System.out.println(bucho);
    }

}
