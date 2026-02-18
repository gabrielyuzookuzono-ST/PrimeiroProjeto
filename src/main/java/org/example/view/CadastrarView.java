package org.example.view;

import org.example.model.Cadastro;

import java.util.List;
import java.util.Scanner;

public class CadastrarView {

    Scanner scanner = new Scanner(System.in);

    public String pedirNome() {
        System.out.println("Olá, digite seu nome!");
        return scanner.nextLine();
    }

    public int pedirIdade() {
        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();
        scanner.nextLine();
        return idade;
    }

    public String pedirCidadeNatal() {
        System.out.println("Qual sua cidade natal?");
        return scanner.nextLine();
    }

    public void mostrarResumo(Cadastro cadastro) {
        System.out.println("**********RESUMO DO CADASTRO**********");
        System.out.println("NOME: " + cadastro.getNome());
        System.out.println("IDADE: " + cadastro.getIdade());
        System.out.println("CIDADE NATAL: " + cadastro.getCidadeNatal());
    }

    public int confirmarCadastro() {
        System.out.println("    CONFIRMAR CADASTRO?");
        System.out.println("1 - SIM        0 - NÃO ");

        int opcaoCadastrar = scanner.nextInt();
        scanner.nextLine();
        return opcaoCadastrar;
    }

    public void mostrarLista(List<Cadastro> cadastros) {
        System.out.println("LISTA DE PESSOAS CADASTRADAS");
        for (Cadastro cadastro : cadastros) {
            System.out.println("NOME: " + cadastro.getNome());
            System.out.println("IDADE: " + cadastro.getIdade());
            System.out.println("CIDADE NATAL: " + cadastro.getCidadeNatal());
            System.out.println("-------------------------------------------");
        }

    }
}

