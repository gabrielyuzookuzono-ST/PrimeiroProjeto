package org.example.controller;

import org.example.model.Cadastro;
import org.example.repository.CadastroRepository;
import org.example.service.CadastroService;
import org.example.view.CadastrarView;
import org.example.view.ListaView;
import org.example.view.MenuView;

public class CadastroController {

    public static void main(String[] args) {

        CadastrarView cadastrarView = new CadastrarView();
        MenuView menu = new MenuView();
        CadastroService cadastroService = new CadastroService();
        CadastroRepository repository = new CadastroRepository();

        boolean executando = true;

        while (executando) {

            int opcaoMenu = menu.menuInicial();

            switch (opcaoMenu) {
                case 1 -> {
                    String nome = cadastrarView.pedirNome();
                    int idade = cadastrarView.pedirIdade();
                    String cidadeNatal = cadastrarView.pedirCidadeNatal();

                    Cadastro cadastro = new Cadastro(nome,idade,cidadeNatal);

                    cadastroService.validarCadastro(cadastro);

                    cadastrarView.mostrarResumo(cadastro);

                    int opcaoCadastrar = cadastrarView.confirmarCadastro();
                    if (opcaoCadastrar == 1) {
                        System.out.println("Pessoa cadastrada com sucesso!");
                        repository.salvar(cadastro);
                    } else {
                        System.out.println("Cadastro não concluido, voltando ao menu...");
                    }

                }
                case 0 -> {
                    System.out.println("Encerrando programa...");
                    executando = false;
                }
                case 2 -> {

                    if (repository.listaVazia()) {
                        System.out.println("NENHUMA PESSOA CADASTRADA!");
                    } else {
                        cadastrarView.mostrarLista(repository.listaCadastrados());
                    }
                }
                default -> {
                    System.out.println("opção inválida!");
                }
            }








        }
    }
}
