package br.edu.ifpb.infra.persistence.memory;

import br.edu.ifpb.domain.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PessoasEmMemoria {

    private List<Pessoa> pessoas = new ArrayList<>();

    public void adicionar(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }

    public List<Pessoa> todasAsPessoas(){
        return Collections.unmodifiableList(
                this.pessoas
        );
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public String toString() {
        return "PessoasEmMemoria{" +
                "pessoas=" + pessoas +
                '}';
    }
}
