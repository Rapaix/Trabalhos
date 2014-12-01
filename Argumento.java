package AulasEtemb;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by luisportugal on 17/10/14.
 */
public class Argumento {
    public static void main(String[] args) throws IOException {
        /*
        System.out.println("*******     *******     *******     **       **    ******* ");
        System.out.println("*******     *******     *******     ***     ***    **    **");
        System.out.println("***           ***       ***         ****   ****    **    **");
        System.out.println("*******       ***       *******     ** ** ** **    ******* ");
        System.out.println("*******       ***       *******     **  ***  **    ******* ");
        System.out.println("***           ***       ***         **       **    **    **");
        System.out.println("*******       ***       *******     **       **    **    **");
        System.out.println("*******       ***       *******     **       **    ******* ");

        System.out.println();
        System.out.println("Meus Jogos Preferidos: ");
        System.out.println("1. " + args[0]);
        System.out.println("2. " + args[1]);
        System.out.println("3. " + args[2]);
        System.out.println();

        System.out.println("Informe seu Nome: ");
        byte[] bt = new byte[50];
        System.in.read(bt);
        String nome = new String(bt).trim();
        System.out.printf("%s: Seja Bem Vindo... \n\n", nome);
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("\nInforme seu Nome...?");
        String nome = scan.nextLine();

        System.out.println("\nInforme seu E-mail...?");
        String email = scan.nextLine();

        System.out.println("\nDados Recebidos: ");
        System.out.printf("Nome:\t %s \nE-mail:\t %s \n\n", nome, email);
    }
}
