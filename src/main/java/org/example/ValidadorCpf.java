package org.example;

public class ValidadorCpf {
    public ValidadorCpf() {
    }
    public String validarcpf(String cpf){
        if(cpf == null || cpf.length() != 11 || !cpf.matches("[0-9]+")){
            throw new IllegalArgumentException("CPF INVÁLIDO!");
        }
        return cpf;
    }
}
