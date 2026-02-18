package org.example.view;

import java.util.Scanner;

public class MenuView {

    Scanner scanner = new Scanner(System.in);

    public int menuInicial () {
        System.out.println("* * * * * * * M E N U * * * * * * *");
        System.out.println("        SELECIONE SUA OPÇÃO        ");
        System.out.println("1 - CADASTRAR PESSOA");
        System.out.println("2 - VER LISTA DE PESSOAS");
        System.out.println("0 - SAIR");

        int opcaoMenu = scanner.nextInt();
        scanner.nextLine();
        return opcaoMenu;
    }













}
