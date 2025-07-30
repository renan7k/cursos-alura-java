package com.alura.cursos.java.curso03_listasecolecoes.desafiofinalcompras.principal;

import com.alura.cursos.java.curso03_listasecolecoes.desafiofinalcompras.modelo.CartaoDeCredito;
import com.alura.cursos.java.curso03_listasecolecoes.desafiofinalcompras.modelo.Compra;

import java.util.Collections;
import java.util.Scanner;
//Criar uma aplicação de compra, que estabeleça um limite do cartão, e adicione compras (descrição e valor) enquanto o
//limite permitir. Também deve ter um menu, e exibir o extrato de compras ordenando por valor
//Usar os conhecimentos de arrayList, compare, etc.
public class Principal {
    public static void main(String[] args) {
        //Primeiramente, capturamos o valor, salvamos numa variável e passamos ela ao instanciarmos o objeto cartão.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = input.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        String menu = """
                ********** APLICAÇÃO DE COMPRAS **********
                1 - Realizar compra
                2 - Visualizar extrato do cartão
                3 - Sair
                ******************************************
                Digite sua opção:
                """;
        int opcao = 0;
        while (opcao != 3 ){
            System.out.println(menu);
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    input.nextLine();
                    System.out.println("Digite a descrição da compra:");
                    String descricao = input.nextLine();
                    System.out.println("Digite o valor da compra:");
                    double valor = input.nextDouble();

                    Compra compra = new Compra(descricao, valor);
                    boolean compraRealizada = cartao.lancaCompra(compra);

                    if (compraRealizada){
                        System.out.println("Compra realizada com sucesso!\n");
                    } else {
                        System.out.println("Saldo insuficiente!\n");
                    }
                    break;
                case 2:
                    System.out.println("########################");
                    System.out.println("EXTRATO DO CARTÃO -COMPRAS REALIZADAS:");
                    Collections.sort(cartao.getCompras());
                    for (Compra c : cartao.getCompras()){
                        System.out.println(c.getDescricao() + " - " + c.getValor());
                    }
                    System.out.println("########################");
                    System.out.println("Saldo do cartão: " +cartao.getSaldo() +"\n\n");
                    break;
                case 3:
                    System.out.println("Saindo ...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente \n");
            }
        }
        System.out.println("Aplicação encerrada.");
    }
}
