package Empresa.model.domain;

public abstract class Pessoa {
    private String nome;
    private String CPF;
    private String RG;
    private Endereco endereco;
    private Contato contato;

    public Pessoa(String nome, String CPF, String RG, Endereco endereco, Contato cont) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        //this.endereco = new Endereco(end);
        //this.contato = new Contato(cont);
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
