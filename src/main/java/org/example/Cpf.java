package org.example;

public class Cpf {
    private String cpf;
    private ValidadorCpf validadorCpf;

    public Cpf(String cpf) {
        this.validadorCpf = new ValidadorCpf();
        this.cpf = validadorCpf.validarcpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }
}
