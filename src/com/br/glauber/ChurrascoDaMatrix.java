package com.br.glauber;

import java.util.Locale;
import java.util.Scanner;

public class ChurrascoDaMatrix {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        // ENTRADA DO USUÁRIO
        var opcao = 0;
        var adultos = 0;
        var crianças = 0;

        // CONSUMO DOS ADULTOS
        var carneAdultos = 300.0;
        var linguicaAdultos = 300.0;
        var bebidaAdultos = 600.0;

        // CONSUMO DAS CRIANÇAS
        var carneCriancas = 250.0;
        var linguicaCriancas = 250.0;
        var bebidaCriancas = 550.0;


        var calculoCarne = 0.00;
        var calculoLinguica = 0.00;
        var calculoBebida = 0.00;

        System.out.println("ESCOLHA UMA OPÇÃO: \n 0 ==> PARA FINALIZAR\n " +
                "1 ==> PARA INFORMAR O NÚMERO DE ADULTOS E CRIANÇAS\n 2 ==> PARA INFORMAR O NÚMERO DE PESSOAS");
        opcao = entrada.nextInt();

        if (opcao == 0) {
            System.out.println("ATÉ LOGO :)");
        } else if (opcao == 1) {

            System.out.println("INFORME O NUMERO DE ADULTOS");
            adultos = entrada.nextInt();
            System.out.println("AGORA, INFORME O NUMERO DE CRIANÇAS");
            crianças = entrada.nextInt();

            calculoCarne = (carneAdultos * adultos) + (carneCriancas * crianças);
            calculoLinguica = (linguicaAdultos * adultos) + (linguicaCriancas * crianças);
            calculoBebida = (bebidaAdultos * adultos) + (bebidaCriancas * crianças);

            System.out.println("CALCULO FINALIZADO...\n PARA ALIMENTAR " + adultos + " ADULTOS" + " E " + crianças + " CRIANÇAS, SERÃO NESCESSÁRIOS:  \n" +
                    calculoCarne + " GRAMAS DE CARNE, " + calculoLinguica + " GRAMAS DE LINGUIÇA E " + calculoBebida + " ML(s) DE BEBIDA");

        } else if (opcao == 2) {

            System.out.println("INFORME O NUMERO DE ADULTOS");
            adultos = entrada.nextInt();

            calculoCarne = (carneAdultos * adultos);
            calculoLinguica = (linguicaAdultos * adultos);
            calculoBebida = (bebidaAdultos * adultos);

            System.out.println("CALCULO FINALIZADO...\n PARA ALIMENTAR " + adultos + " ADULTOS" + " SERÃO NESCESSÁRIOS: \n"
                    + calculoCarne + " GRAMAS DE CARNE, " + calculoLinguica + " GRAMAS DE LINGUIÇA E " + calculoBebida + " ML(s) DE BEBIDA");
        } else {
            System.out.println("OPÇÃO INVÁLIDA");
        }
        entrada.close();
    }
}

