package Empresa.Model;

import Empresa.Model.Pessoa;
import Empresa.Controller.PessoaController;
import Empresa.Controller.ServicoController;
import Empresa.Controller.ServicoPrestadoController;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Empresa {
    private int id;
    private String nome;
    private String password;
    private ServicoController servicos;
    private PessoaController clientes;
    private PessoaController funcionarios;
    private ServicoPrestadoController servicosPrestados;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    // c/ id
    public Empresa(int id, String nome, ServicoController servicos, PessoaController clientes, PessoaController funcionarios, ServicoPrestadoController servicosPrestados) {
        this.id = id;
        this.nome = nome;
        this.servicos = servicos;
        this.clientes = clientes;
        this.funcionarios = funcionarios;
        this.servicosPrestados = servicosPrestados;
    }
    // s/ id
    public Empresa(String nome, ServicoController servicos, PessoaController clientes, PessoaController funcionarios, ServicoPrestadoController servicosPrestados) {
        this.nome = nome;
        this.servicos = servicos;
        this.clientes = clientes;
        this.funcionarios = funcionarios;
        this.servicosPrestados = servicosPrestados;
    }

    private ObservableList<String> list;

    public Empresa() {
        list = FXCollections.observableArrayList(new ArrayList<String>());
    }

    public void add(String string) {
        list.add(string);
    }

    public void edit(String string, String toEdit) {
        list.set(list.indexOf(toEdit), string);
    }

    public void delete(String toDelete) {
        list.remove(toDelete);
    }

    public ObservableList<String> getList() {
        return list;
    }
}
