package Empresa.model.domain;

import Empresa.Model.Contato;
import Empresa.Model.Endereco;
import Empresa.Model.Pessoa;

public class Cliente extends Pessoa {
    public Cliente(String nome, String CPF, String RG, Endereco endereco, Contato contato) {
        super(nome, CPF, RG, endereco, contato);
    }
}
