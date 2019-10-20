package empresa.model.domain;

import empresa.model.domain.Pessoa;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Empresa {
    private int id;
    private String nome;
    private String password;
    private List<Servico> servicos;
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;
    private List<ServicoPrestado> servicosPrestados;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    // c/ id
    public Empresa(int id, String nome, List<Servico> servicos, List<Cliente> clientes, List<Funcionario> funcionarios, List<ServicoPrestado> servicosPrestados) {
        this.id = id;
        this.nome = nome;
        this.servicos = servicos;
        this.clientes = clientes;
        this.funcionarios = funcionarios;
        this.servicosPrestados = servicosPrestados;
    }
    // s/ id
    public Empresa(String nome, List<Servico> servicos, List<Cliente> clientes, List<Funcionario> funcionarios, List<ServicoPrestado> servicosPrestados) {
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
