
package caixa.eletrônico;

import java.util.Scanner;

public class CaixaEletrônico {
        
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //variaveis
        String nome;
        String cpf = "123.456.789-00";
        String cpf_digi;
        String senha = "01020304";
        String senha_digi;
        double saldo_inicial = 1000;
        double deposito;
        double saque;
        int dig;
        
        //tela de inicio
        System.out.println("Seja Bem Vindo!");
        
        //nome
        System.out.print("Nome: ");
        nome = input.nextLine();
        
        //CPF
        System.out.print("Digite o seu CPF " + nome + ": ");
        cpf_digi = input.nextLine();
        
        //Código
        //Cpf
        if (cpf_digi.equals(new String(cpf))) {
            System.out.print("Digite sua senha: ");
            senha_digi = input.nextLine();
            //Senha
            if (senha_digi.equals(new String(senha))) {
                do {
                System.out.println();
                System.out.println("Digite 1 - Saldo");
                System.out.println("Digite 2 - Depósito");
                System.out.println("Digite 3 - Saque");
                System.out.println("Digite 0 - Sair");
                dig = input.nextInt();
                switch (dig) {
                    case 1:
                        System.out.println();
                        System.out.printf("Saldo: R$%.2f", saldo_inicial);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println();
                        System.out.printf("Depósito: R$");
                        deposito = input.nextDouble();
                        saldo_inicial = saldo_inicial + deposito;
                        System.out.println();
                        break;
                    case 3:
                        System.out.println();
                        System.out.printf("Saque: R$");
                        saque = input.nextDouble();
                        saldo_inicial = saldo_inicial - saque;
                        break;
                } } while (dig != 0);
            } else {
                System.err.println("SENHA INVÁLIDA!");
            }
        } 
        else {
            System.err.println("CPF INVÁLIDO!");
        }
        input.close();
    }  
}
