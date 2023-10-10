import java.sql.SQLOutput;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<PessoaFisica> listaPf = new ArrayList<>();
        PessoaFisica metodoPf = new PessoaFisica();

        System.out.println("Bem vindo ao sistema de cadastro de Pessoa Fisica e Juridica");
        Scanner leitor = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Escolha uma opcao: 1 - Pessoa Fisica / 2 - Pessoa Juridica / 0 - Sair");
            opcao = leitor.nextLine();

            switch (opcao) {
                case "1":

                    String opcaoPf;

                    do {
                        System.out.println("Digite uma opcao: 1-Cadastrar PF / 2-Listar PF / 0-Voltar");
                        opcaoPf = leitor.nextLine();

                        switch(opcaoPf){
                            case "1":

                                PessoaFisica novaPF = new PessoaFisica();
                                Endereco novoEndPF = new Endereco();

                                System.out.println("Digite o nome: ");
                                novaPF.nome = leitor.nextLine();

                                System.out.println("Digite o cpf");
                                novaPF.cpf = leitor.nextLine();

                                System.out.println("Digite o rendimento");
                                novaPF.rendimento = leitor.nextFloat();

                                System.out.println("Digite a data de nascimento: (dd/mm/aaaa)");
                                novaPF.dataNasc = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/YYYY"));

                                Period idade = Period.between(novaPF.dataNasc, LocalDate.now());

                                if (idade.getYears() >= 18) {
                                    System.out.println("Idade Válida!");
                                } else {
                                    System.out.println("Idade Inválida!");
                                    break;
                                }

                                System.out.println("Digite o logradouro");
                                novoEndPF.logradouro = leitor.next();

                                System.out.println("Digite o numero");
                                novoEndPF.numero = leitor.nextInt();

                                System.out.println("Este endereco é comercial? S/N: ");
                                String endCom = leitor.next();
                                if(endCom.equals("S") || endCom.equals("S")){
                                    novoEndPF.endcomercial = true;
                                } else {
                                    novoEndPF.endcomercial = false;
                                }

                                novaPJ.endereco = novoEndPJ;

                                listaPf.add(novaPF);

                                System.out.println("Cadastro realizado com sucesso!");

                                break;
                            case "2":

                                if (listaPf.size() > 0){

                                    for (PessoaFisica cadaPf : listaPf) {
                                        System.out.println("Nome: " + cadaPf.nome);
                                        System.out.println("cpf: " + cadaPf.cpf);
                                        System.out.println("Data de Nascimento: " + cadaPf.dataNasc.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
                                        System.out.println("Endereco: " + cadaPf.endereco.logradouro + " - " + cadaPf.endereco.numero);
                                        System.out.println("Imposto a ser pago: " + metodoPf  .CalcularImposto(cadaPf.rendimento));
                                        System.out.println();
                                        System.out.println("Aperte ENTER para CONTINUAR");
                                        leitor.nextLine();
                                    }
                                } else {
                                    System.out.println("Lista vazia!");
                                }
                                break;
                            case "0":
                                System.out.println("Volta");
                                break;

                            default:
                                System.out.println("Opcao invalida");
                                break;
                        }

                    } while(!opcaoPf.equals("0"));


                    //System.out.println("case 1");
                    break;

                case "2":

                    PessoaJuridica novaPJ = new PessoaJuridica();
                    Cnpj novoCnpj = new Cnpj();

                    System.out.println("Digite o seu cnpj: ");
                    novaPJ.nome = leitor.next();

                    System.out.println("Digite o rendimento");
                    novaPJ.rendimento = leitor.nextFloat();

                    //System.out.println("Digite a data de nascimento: (dd/mm/aaaa)");
                    //novaPJ.dataNasc = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/YYYY"));

                    System.out.println("Digite o logradouro");
                    novoEndPJ.logradouro = leitor.next();

                    System.out.println("Digite o numero");
                    novoEndPJ.numero = leitor.nextInt();

                    System.out.println("Este endereco é comercial? S/N: ");
                    String endCom = leitor.next();
                    if(endCom.equals("S") || endCom.equals("S")){
                        novoEndPJ.endcomercial = true;
                    } else {
                        novoEndPJ.endcomercial = false;
                    }

                    novaPJ.endereco = novoEndPJ;

                    listaPJ.add(novaPJ);

                    System.out.println("Cadastro realizado com sucesso!");

                    break;
                case "2":

                    if (listaPJ.size() > 0){

                        for (PessoaJuridica cadaPj : listaPj) {
                            System.out.println("Nome: " + cadaPj.nome);
                            System.out.println("cnpj: " + cadaPj.cnpj);
                            //System.out.println("Data de Nascimento: " + cadaPj.dataNasc.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
                            System.out.println("Endereco: " + cadaPj.endereco.logradouro + " - " + cadaPj.endereco.numero);
                            System.out.println("Imposto a ser pago: " + metodoPj  .CalcularImposto(cadaPj.rendimento));
                            System.out.println();
                            System.out.println("Aperte ENTER para CONTINUAR");
                            leitor.nextLine();
                        }
                    } else {
                        System.out.println("Lista vazia!");
                    }
                    break;
                case "0":
                    System.out.println("Volta");
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        } while(!opcaoPj.equals("0"));

        {

        }







