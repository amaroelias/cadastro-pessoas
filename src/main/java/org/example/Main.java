package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Pessoa");
            System.out.println("2 - Remover Pessoa");
            System.out.println("3 - Ver Pessoas Cadastradas");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome:");
                    String nome = scanner.nextLine();

                    System.out.println("Informe o CPF:");
                    String cpf = scanner.nextLine();

                    System.out.println("Informe o telefone:");
                    String telefone = scanner.nextLine();
                    try {
                        Pessoa novaPessoa = new Pessoa(nome, cpf, telefone);
                        cadastro.addPessoa(novaPessoa);
                        System.out.println("Pessoa adicionada com sucesso!");
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Informe o CPF da pessoa a ser removida:");
                    String cpfRemover = scanner.nextLine();
                    try {
                        cadastro.removerPessoa(cpfRemover);
                        System.out.println("Pessoa removida com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println(cadastro.verPessoasCadastradas());
                    break;

                case 4:
                    System.out.println("Saindo do programa. Até mais!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}