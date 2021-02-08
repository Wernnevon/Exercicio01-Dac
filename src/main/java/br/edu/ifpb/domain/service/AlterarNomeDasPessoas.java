package br.edu.ifpb.domain.service;

import br.edu.ifpb.domain.Pessoa;

public class AlterarNomeDasPessoas {
    public void alterarNome(Pessoa pessoa){
        pessoa.alterarNomeMinusculo();
    }
}
