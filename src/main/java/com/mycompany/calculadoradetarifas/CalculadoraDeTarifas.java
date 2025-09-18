/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoradetarifas;
import java.util.Scanner;// importei a classe scanner



public class CalculadoraDeTarifas { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // Neste bloco serão perguntados o tipo de transporte (incluso o valor da tarifa)
        try {
            System.out.println("=== CALCULADORA DE TARIFAS DE TRANSPORTE ===");
            System.out.println("Escolha o tipo de transporte:");//mensagem para o usuário
            System.out.println("1 - Ônibus urbano (R$ 4,40)");//opção 1- ônibus urbano e seu respectivo valor
            System.out.println("2 - Metrô (R$ 5,00)");//opção 2- metrô e seu respectivo valor
            System.out.println("3 - Trem intermunicipal (R$ 6,50)");//opção 3- trem intermunicipal e sue respectivo valor
            System.out.println("4 - Ônibus rodoviário (R$ 12,00)");//opção 4- ônibus rodoviário e seu respectivo valor
            System.out.print("Digite sua opção: "); // é exibido essa mensagem para a escolha de uma das opções
            
            int opcao = scanner.nextInt();//declarei a varíavel int para as opções
            
            System.out.print("Digite a quantidade de bilhetes: "); //exibe essa mensagem para que o usuário digite a quantidade de bilhetes desejada
            int quantidade = scanner.nextInt();//declarei a variável int para a quantidade de bilhetes
            
            if (quantidade <= 0) { //se a quantidade for menor ou igual a zero, o programa exibirá a mensagem de erro
                System.out.println("ERRO: Quantidade deve ser maior que zero!");
                return;
            }
            
            double tarifa = 0.0;//declarei a variável double para a tarifa
            String tipoTransporte = "";
            
            //A partir desse bloco, inicia-se o switch case
            switch (opcao) {
                case 1: // opção 1
                    tarifa = 4.40;
                    tipoTransporte = "Ônibus urbano";
                    break;
                case 2: // opção 2
                    tarifa = 5.00;
                    tipoTransporte = "Metrô";
                    break;
                case 3: //opção 3
                    tarifa = 6.50;
                    tipoTransporte = "Trem intermunicipal";
                    break;
                case 4: //opção 4
                    tarifa = 12.00;
                    tipoTransporte = "Ônibus rodoviário";
                    break;
                default:
                    System.out.println("ERRO: Opção inválida! Digite um número de 1 a 4."); // mensagem de erro
                    return;
            }
            
            double valorTotal = tarifa * quantidade; // declarei a variável double para o valor total da compra
            
            //E aqui será exibido o resumo da compra, com todos os dados informados anteriormente
            System.out.println("\n=== RESUMO DA COMPRA ===");
            System.out.println("Transporte: " + tipoTransporte);
            System.out.println("Quantidade de bilhetes: " + quantidade);
            System.out.println("Valor unitário: R$ " + String.format("%.2f", tarifa));
            System.out.println("Valor total: R$ " + String.format("%.2f", valorTotal));
            
        } catch (Exception e) {
            System.out.println("\nERRO: Por favor, digite apenas números válidos!");
            System.out.println("Tipo de erro: " + e.getClass().getSimpleName());
            
        } finally {
            System.out.println("\nObrigado pela compra!"); //mensagem final
            scanner.close();// fecha o scanner 
        }
    }
}
