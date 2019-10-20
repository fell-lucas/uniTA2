package empresa.model.domain;

import empresa.model.domain.Contato;
import empresa.model.domain.Endereco;

public abstract class Pessoa {
    private String nome;
    private String CPF;
    private String RG;
    private Endereco endereco;
    private Contato contato;

    public Pessoa(String nome, String CPF, String RG, Endereco endereco, Contato contato) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.endereco = new Endereco(endereco);
        this.contato = new Contato(contato);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
}
