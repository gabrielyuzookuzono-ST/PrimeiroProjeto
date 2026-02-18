package org.example.repository;

import org.example.model.Cadastro;
import java.util.ArrayList;
import java.util.List;

public class CadastroRepository {

    private List<Cadastro> cadastros = new ArrayList<>();

    public void salvar(Cadastro cadastro) {
        cadastros.add(cadastro);
    }

    public List<Cadastro> listaCadastrados() {
        return cadastros;
    }

    public boolean listaVazia () {
        return cadastros.isEmpty();
    }

}
