package org.example;


import java.util.HashMap;

public class CadastroPessoas {
    private HashMap<String, Pessoa> pessoasCadastradas;

    public CadastroPessoas() {
        this.pessoasCadastradas = new HashMap<>();
    }

    public void addPessoa(Pessoa pessoa){
        if(pessoa == null){
            throw new RuntimeException("PESSOA NÃO PODE SER NULL!");
        }
        pessoa.setNumeroCadastro(pessoasCadastradas.size()+1);
        this.pessoasCadastradas.put(pessoa.getCpf(), pessoa);
    }

    public void removerPessoa(String cpf){
        if(!pessoasCadastradas.containsKey(cpf)){
            throw new IllegalArgumentException("ESTA PESSOA NÃO ESTÁ NO CADASTRO!");
        }
        this.pessoasCadastradas.remove(cpf);
    }

    public String verPessoasCadastradas(){
        if(pessoasCadastradas.isEmpty()){
            return "NÃO HÁ PESSOAS CADASTRADAS!";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lista de pessoas cadastradas: \n");
        stringBuilder.append(" \n");
        for(Pessoa pessoa : pessoasCadastradas.values()){
            stringBuilder.append(pessoa.getNumeroCadastro()+" | "+pessoa.getNome()+" | "+pessoa.getCpf()+" | "+pessoa.getTelefone()+"\n");
        }
        return stringBuilder.toString();
    }
}
