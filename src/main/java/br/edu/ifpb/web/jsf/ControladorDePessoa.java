package br.edu.ifpb.web.jsf;

import br.edu.ifpb.domain.Pessoa;
import br.edu.ifpb.infra.persistence.memory.PessoasEmMemoria;
import br.edu.ifpb.domain.service.AlterarNomeDasPessoas;


import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
//@Named
@RequestScoped
//@SessionScoped
public class ControladorDePessoa implements Serializable {

    private Pessoa pessoa = new Pessoa("");
    private AlterarNomeDasPessoas service = new AlterarNomeDasPessoas();
    private PessoasEmMemoria pessoas  = new PessoasEmMemoria();

    public String redirecionar() {
        // executando a lógica de negócio
        service.alterarNome(pessoa);
        pessoa.alterarNome();
        // redirecionando...
//        return null; // fica na página original
        return "home"; // encmainhar a requisição à página
//        return "home.xhtml?faces-redirect=true"; // nova requisição
    }

    public String adicionar() {
//          people.add(pessoa.getNome());
        this.pessoas.adicionar(pessoa);
        pessoa = new Pessoa("");
//        System.out.println(pessoas);
        return null;
    }

    public List<Pessoa> todasAsPessoas() {
        return this.pessoas.todasAsPessoas();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public PessoasEmMemoria getPessoas() {
        return pessoas;
    }

    public void setPessoas(PessoasEmMemoria pessoas) {
        this.pessoas = pessoas;
    }
}
