package org.example;

public class Pessoa {
    private String nome;
    private Cpf cpf;
    private String telefone;
    private int numeroCadastro;

    public Pessoa(String nome, String cpf, String telefone) {
        if(nome.length() < 3 || !nome.toLowerCase().matches("[a-z]+")){
            throw new IllegalArgumentException("NOME INVÁLIDO!");
        }
        if(telefone.length() != 11 || !telefone.matches("[0-9]+")){
            throw new IllegalArgumentException("TELEFONE INVÁLIDO!");
        }
        this.nome = nome;
        this.cpf = new Cpf(cpf);
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf.getCpf();
    }

    public int getNumeroCadastro() {
        return numeroCadastro;
    }

    public void setNumeroCadastro(int numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }
}
