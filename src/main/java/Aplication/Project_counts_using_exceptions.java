/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Aplication;

import java.util.Locale;
import static java.util.Locale.US;
import java.util.Scanner;
import model.entities.Account;

/**
 *
 * @author socorro
 */
public class Project_counts_using_exceptions {

    public static void main(String[] args) {

        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Número: ");
        int numberAccount = sc.nextInt();

        System.out.print("Titular: ");
        sc.nextLine();

        String holder = sc.nextLine();

        System.out.print("Saldo: ");
        double balance = sc.nextDouble();

        System.out.print("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(numberAccount, holder, balance, withdrawLimit);

//        System.out.println();
        System.out.print("Valor de saque: ");
        double amount = sc.nextDouble();
 
        if (amount > acc.getWithdrawLimit()) {
            System.out.println("Valor de saque maior que o Limite de saque: " + acc.getWithdrawLimit());
        } else if (amount > acc.getBalance()) {
            System.out.println("Valor de saque maior que o saldo em conta: " + acc.getBalance());
        } else{
               acc.withdraw(amount);

        }
        System.out.printf("Saldo atual: %.2f%n", acc.getBalance());

        sc.close();
    }
}
