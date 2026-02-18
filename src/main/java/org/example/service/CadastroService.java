package org.example.service;

import org.example.model.Cadastro;
import org.example.view.CadastrarView;

public class CadastroService {

    public boolean validarCadastro (Cadastro cadastro) {
        if (cadastro.getNome()== null || cadastro.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        if (cadastro.getIdade()< 0 || cadastro.getIdade()>120) {
            throw new IllegalArgumentException("Idade inválida!");
        }
        if (cadastro.getCidadeNatal()== null || cadastro.getCidadeNatal().isBlank()) {
            throw new IllegalArgumentException("Cidade inválida!");
        }
        return false;
    }






}
